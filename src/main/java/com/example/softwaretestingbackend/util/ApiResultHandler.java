package com.example.softwaretestingbackend.util;

import com.example.softwaretestingbackend.entity.ApiResult;

/**
 * @Author: 🦌🦌🦌
 * @Description: 前端返回值生成器
 * @Param: 传递给前端的参数
 * @return: 返回给前端的结果
 * @Date: 2022/3/22
 */
public class ApiResultHandler {
    public static ApiResult success(){
        return success(null);
    }

    public static ApiResult success(Object object) {
        ApiResult apiResult = new ApiResult();
        apiResult.setData(object);
        apiResult.setCode(200);
        apiResult.setMessage("请求成功");
        return apiResult;
    }

    public static ApiResult fail(String message){
        return new ApiResult(0,message,null);
    }

    public static ApiResult buildApiResult(Integer code, String message, Object data) {
        ApiResult apiResult = new ApiResult();

        apiResult.setCode(code);
        apiResult.setMessage(message);
        apiResult.setData(data);
        return apiResult;
    }
}

