package com.atguigu.eduservice.service.impl;

import com.atguigu.eduservice.mapper.EduTeacherMapper;
import com.atguigu.eduservice.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
//删除业务逻辑
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    public EduTeacherMapper eduTeacherMapper;

    @Override
    public boolean removeById(Serializable id) {
        Integer result = eduTeacherMapper.deleteById(id);
        return null != result && result>0;
    }
}
