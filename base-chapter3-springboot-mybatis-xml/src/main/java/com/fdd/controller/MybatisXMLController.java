package com.fdd.controller;

import com.alibaba.fastjson.JSONObject;
import com.fdd.bean.MybatisXML;
import com.fdd.mapper.MybatisXMLMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/26 15:34
 * @WeChat: fdd15735171890
 */
@RestController
@EnableTransactionManagement
public class MybatisXMLController {


        @Autowired
        private MybatisXMLMapper mybatisXMLMapper;

        @GetMapping("/all")
        public JSONObject findAll(){
            List<MybatisXML> list = mybatisXMLMapper.findAll();
            JSONObject json =new JSONObject();
            json.put("data",list);
            return json;
        }

        @PostMapping("/add")
        public String addOne(MybatisXML mybatisXML){
            int res = mybatisXMLMapper.add(mybatisXML);
            if(res>=1) {
                return "success";
            }
            return  "failure";
        }

        @PutMapping("/update")
        public JSONObject update(MybatisXML mybatisXML){
            mybatisXMLMapper.update(mybatisXML);
            JSONObject json =new JSONObject();
            json.put("data",mybatisXML);
            return json;
        }

        @GetMapping("/find")
        public JSONObject findOne(int id){
            MybatisXML mybatisXML = mybatisXMLMapper.findOne(id);
            JSONObject json =new JSONObject();
            json.put("data",mybatisXML);
            return json;
        }

        @DeleteMapping("/del")
        public String delOne(int id){
            int res = mybatisXMLMapper.delete(id);
            if (res>=1) {
                return "success";
            }
            return  "failure";
        }



}
