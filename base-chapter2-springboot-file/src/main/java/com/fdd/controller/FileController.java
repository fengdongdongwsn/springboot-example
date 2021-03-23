package com.fdd.controller;

import com.fdd.util.ZipUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/23 15:10
 * @WeChat: fdd15735171890
 */
@RestController
public class FileController {

    /**
     * 单文件上传
     */
    @PostMapping(value = "/file_upload")
    @ApiOperation(value = "文件上传")
    public String upload(@RequestParam("file") MultipartFile file) {
        try {
            //第一步：判断文件是否为空
            if (file.isEmpty()) {
                return "file is empty";
            }
            //第二步：取得文件名字
            String fileName = file.getOriginalFilename();
            //第三步：确定文件保存的路径,这里注意斜杠，win是\\，linux是/
            String filePath = System.getProperty("user.dir")+"/src/main/resources/static/";
            String path = filePath + fileName;
            File dest = new File(path);
            //第四步：检测保存的路径是否存在目录
            if (!dest.exists()) {
                dest.mkdirs();
            }
            //第五步：写入
            file.transferTo(dest);
            return  "file upload success";
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "failure";
    }

    /**
     * 删除文件
     */
    @DeleteMapping(value = "/file_delete")
    public String mapdelete(String name){
        String filePath = System.getProperty("user.dir")+"/src/main/resources/static/";
        File f = new File(filePath);
        File[] files=f.listFiles();
        for(File file: files){
            if(file.isFile()){
                String filename=file.getName();
                if(filename.equals(name)){
                    boolean status = file.delete();
                    if(status==true){
                        return  name+" delete success";
                    }else{
                        return  name+" delete failure";
                    }
                }
            }
        }
        return "file delete fail";
    }

    /**
     *   单文件查询
     */
    @PostMapping("/file_one_down")
    public String  testDownload(HttpServletResponse response , String name) {
        //1、设置为文件配置
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=" + name);
        byte[] buff = new byte[1024];
        //2、创建缓冲输入流
        BufferedInputStream bis = null;
        OutputStream outputStream = null;
        try {
            outputStream = response.getOutputStream();
            //3、这个路径为待下载文件的路径
            String filePath = System.getProperty("user.dir")+"/src/main/resources/static/";
            bis = new BufferedInputStream(new FileInputStream(new File(filePath + name )));
            int read = bis.read(buff);
            //4、通过while循环写入到指定了的文件夹中
            while (read != -1) {
                outputStream.write(buff, 0, buff.length);
                outputStream.flush();
                read = bis.read(buff);
            }
        } catch ( IOException e ) {
            e.printStackTrace();
            //出现异常返回给页面失败的信息
            return "fail";
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //成功后返回成功信息
        return "下载成功";
    }

    /**
     *  多文件查询：文件下载
     */
    @PostMapping("/file_all_down")
    public String  selectAll(HttpServletResponse response) {

        //1、创建临时文件夹
        String tempPath = System.getProperty("user.dir")+"/src/main/resources/static/tmp";
        File temDir = new File(tempPath);
        if (!temDir.exists()) {
            temDir.mkdirs();
        }
        //2、找到项目文件存放地址
        String fileUrl = System.getProperty("user.dir")+"/src/main/resources/static/";
        //3、移动项目文件到临时文件夹
        try {
            ZipUtils.copyDir(fileUrl, tempPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //4、设置response的header
        response.setContentType("application/zip");
        response.setHeader("Content-Disposition", "attachment; filename=uchainfile.zip");

        //5、调用工具类，下载zip压缩包
        try {
            ZipUtils.toZip(temDir.getPath(), response.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //6、删除临时文件和文件夹
        File[] listFiles = temDir.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            listFiles[i].delete();
            System.out.println("正在删除第"+i+"个文件");
        }
        boolean s = temDir.delete();
        if(s==true) {
            return "success";
        }
        return "failure";
    }

}
