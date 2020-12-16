package com.atguigu.eduservice.controller;

import com.atguigu.commonutils.R;
import com.atguigu.eduservice.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherAdminController {

    @Autowired
    public TeacherService teacherService;
    @ApiOperation(value = "根据id删除讲师")
    @DeleteMapping("{id}")
    public R removeById(@ApiParam (name= "id",value = "讲师ID",required = true)@PathVariable String id){
        boolean result = teacherService.removeById(id);
        return (result == true)?R.ok():R.error().message("删除失败");
    }
}
