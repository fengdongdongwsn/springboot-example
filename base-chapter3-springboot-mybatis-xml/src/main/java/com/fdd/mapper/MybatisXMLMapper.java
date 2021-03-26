package com.fdd.mapper;

import com.fdd.bean.MybatisXML;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 愚公要移山
 * @Date: 2021/3/26 15:43
 * @WeChat: fdd15735171890
 */
@Mapper
public interface MybatisXMLMapper {

    List<MybatisXML> findAll();

    MybatisXML findOne(Integer id);

    int add(MybatisXML mybatisXML);

    int update(MybatisXML mybatisXML);

    int delete(Integer id);
}
