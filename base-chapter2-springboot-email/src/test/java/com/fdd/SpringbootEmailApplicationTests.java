package com.fdd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;

@SpringBootTest
class SpringbootEmailApplicationTests {

    @Autowired
    JavaMailSender javaMailSender;

    //测试一：简单邮件发送
    @Test
    public void sendSimpleMail() {
        SimpleMailMessage msg = new SimpleMailMessage();    //构建一个邮件对象
        msg.setSubject("这是一封测试邮件"); // 设置邮件主题
        msg.setFrom("3049352171@qq.com"); // 设置邮箱发送者
        msg.setTo("1183373614@qq.com"); // 设置邮件接收者，可以有多个接收者
        msg.setSentDate(new Date());    // 设置邮件发送日期
        msg.setText("这是测试邮件的正文");   // 设置邮件的正文
        javaMailSender.send(msg);
    }
    //测试二：复杂邮件发送
    @Test
    public void sendMimeMessage() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);

        messageHelper.setFrom("3049352171@qq.com"); // 设置邮箱发送者
        messageHelper.setTo("1183373614@qq.com"); // 设置邮件接收者，可以有多个接收者
        messageHelper.setSubject("复杂邮件主题");
        messageHelper.setText("复杂邮件内容");

        //发送附件
        FileSystemResource file1 = new FileSystemResource(new File("E:/博客/1、数据结构/1608800225(1).jpg"));
        messageHelper.addAttachment("附件-1.jpg", file1);
        FileSystemResource file2 = new FileSystemResource(new File("E:/博客/1、数据结构/PdfTool-master.zip"));
        messageHelper.addAttachment("附件-2", file2);

        javaMailSender.send(mimeMessage);
    }

    //测试三：发送带图片的附件
    @Test
    public void sendImgResMail() throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage,true);
        messageHelper.setFrom("3049352171@qq.com"); // 设置邮箱发送者
        messageHelper.setTo("1183373614@qq.com"); // 设置邮件接收者，可以有多个接收者
        messageHelper.setSubject("邮件主题");
        messageHelper.setText("<p>测试邮件，邮件中包含了以下图片</p>" +
                "<p>第一张图片：</p><img src='cid:fdd'/>",true);
        FileSystemResource file1 = new FileSystemResource(new File("E:/博客/1、数据结构/1608800225(1).jpg"));
        messageHelper.addInline("fdd", file1);
        javaMailSender.send(mimeMessage);
    }


}
