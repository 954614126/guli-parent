package com.atguigu.eduservice.service;

import org.springframework.stereotype.Service;

import java.io.Serializable;


public interface TeacherService {
    public boolean removeById(Serializable id);
}
