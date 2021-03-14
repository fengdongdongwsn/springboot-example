package com.fdd.controller;

import com.fdd.bean.MybatisAnnotion;
import com.fdd.mapper.MybatisAnnotionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MybatisAnnotionController {

    @Autowired
    private MybatisAnnotionMapper mybatisAnnotionMapper;

    @GetMapping(value = "/add")
    public String add(MybatisAnnotion mybatisAnnotion) {
        int result = mybatisAnnotionMapper.insertMybatisAnnotion(mybatisAnnotion);
        if (result > 0) {
            return "success";
        }
        return "failure";
    }
    @PutMapping(value = "/update")
    public String update(MybatisAnnotion mybatisAnnotion) {
        int result = mybatisAnnotionMapper.updateMybatisAnnotion(mybatisAnnotion);
        if (result > 0) {
            return "success";
        }
        return "failure";
    }

    @DeleteMapping(value = "/delete")
    public String delete(String name) {
        int result = mybatisAnnotionMapper.deleteMybatisAnnotionByName(name);
        if (result > 0) {
            return "success";
        }
        return "fail";
    }

    @GetMapping(value = "/selectone")
    public String selectOne(String name) {
        MybatisAnnotion mybatisAnnotion = mybatisAnnotionMapper.selectMybatisAnnotionByName(name);
        return mybatisAnnotion.toString();
    }

    @GetMapping(value = "/selectall")
    public String selectAll() {
        List<MybatisAnnotion> list = mybatisAnnotionMapper.selectAllMybatisAnnotion();
        return list.toString();
    }
}
