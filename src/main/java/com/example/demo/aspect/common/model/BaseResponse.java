package com.example.demo.aspect.common.model;



import com.example.demo.enums.ErrorCodeEnum;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    private String code;


    private String message;


    public BaseResponse() {
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public static BaseResponse addError(ErrorCodeEnum errorCodeEnum) {
        return new BaseResponse(errorCodeEnum.getCode(), errorCodeEnum.getDesc());
    }

    public static BaseResponse addError(ErrorCodeEnum errorCodeEnum, String message) {
        return new BaseResponse(errorCodeEnum.getCode(), message);
    }


    public static BaseResponse addResult() {
        return new BaseResponse(ErrorCodeEnum.SUCCESS.getCode(), ErrorCodeEnum.SUCCESS.getDesc());
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
