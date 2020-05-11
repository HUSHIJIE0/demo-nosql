package com.example.demo.enums;


/**
 * 错误代码枚举类.
 *
 * @Auther: Michael
 * @Date: 2019/10/30/14:49
 * @Description:
 */
public enum ErrorCodeEnum {

    /**
     * 操作成功
     */
    SUCCESS("0000", "success"),

    /**
     * 必选参数为空
     */
    PARAM_EMPTY("1001", "必选参数为空"),

    /**
     * 参数格式错误
     */
    PARAM_ERROR("1002", "参数格式错误"),

    /**
     * 系统异常
     */
    SYSTEM_ERROR("1003", "系统异常"),

    /**
     * 操作失败
     */
    OPERATE_FAILED("1004", "操作失败"),

    /**
     * 系统繁忙
     */
    UNKNOWN_ERROR("9999", "系统繁忙，请稍后再试....");

    private String code;

    private String desc;

    ErrorCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "ErrorCodeEnum{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
