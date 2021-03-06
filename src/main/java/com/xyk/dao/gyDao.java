package com.xyk.dao;

import com.xyk.model.gyModel;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface gyDao {
    List<gyModel> selbyid(String apartment_id);
    List<gyModel> list();
    void add(gyModel gyModel);
    void update(gyModel gyModel);
}
