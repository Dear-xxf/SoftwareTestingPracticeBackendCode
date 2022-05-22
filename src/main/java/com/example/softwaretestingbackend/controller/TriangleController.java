package com.example.softwaretestingbackend.controller;

import com.example.softwaretestingbackend.entity.ApiResult;
import com.example.softwaretestingbackend.util.ApiResultHandler;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;

@Api(tags="三角形")
@RestController
@RequestMapping("triangle")
public class TriangleController {

    @ApiOperation("测试接口")
    @PostMapping("test")
    public ApiResult test(@RequestParam("a")int a,
                          @RequestParam("b")int b,
                          @RequestParam("c")int c){
        int total = a+b+c;
        return ApiResultHandler.success(total);
    }
}
