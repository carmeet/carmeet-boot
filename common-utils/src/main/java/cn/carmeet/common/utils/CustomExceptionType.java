package cn.carmeet.common.utils;

/**
 * @Description:
 * @Author: gyg
 * @Date: 2021-06-08 10:56
 */
public enum CustomExceptionType {
    USER_INPUT_ERROR(400,"用户输入异常"),
    SYSTEM_ERROR (500,"系统服务异常"),
    OTHER_ERROR(999,"其他未知异常");

    CustomExceptionType(int code, String typeDesc) {
        this.code = code;
        this.typeDesc = typeDesc;
    }

    private String typeDesc;//异常类型中文描述

    private int code; //code

    public String getTypeDesc() {
        return typeDesc;
    }

    public int getCode() {
        return code;
    }
}
