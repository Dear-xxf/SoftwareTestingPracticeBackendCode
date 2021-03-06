package com.example.softwaretestingbackend.util;

import com.example.softwaretestingbackend.entity.ApiResult;

/**
 * @Author: π¦π¦π¦
 * @Description: εη«―θΏεεΌηζε¨
 * @Param: δΌ ιη»εη«―ηεζ°
 * @return: θΏεη»εη«―ηη»ζ
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
        apiResult.setMessage("θ―·ζ±ζε");
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

