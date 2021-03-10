package com.fdd.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;


@RestController
public class SwaggerController {

    @PostMapping(value = "/add")
    @ApiOperation(value = "添加方法", notes = "添加方法")
    public String add(String  name) {
        return "add "+ name + " success";
    }

    @PutMapping(value = "/update")
    @ApiOperation(value = "更新评估任务", notes = "更新评估任务")
    public String update(String name) {
        return "success";
    }

    @DeleteMapping(value = "/delete")
    @ApiOperation(value = "删除任务", notes = "删除任务")
    public String delete(String name) {
        return "success";
    }

    @GetMapping(value = "/selectone")
    @ApiOperation(value = "按照名字查询", notes = "按照名字查询")
    public String selectOne(String name) {
        return ""+name;
    }

    @GetMapping(value = "/selectAll")
    @ApiOperation(value = "查询所有", notes = "查询所有")
    public String selectAll() {
        return "json";
    }
}
