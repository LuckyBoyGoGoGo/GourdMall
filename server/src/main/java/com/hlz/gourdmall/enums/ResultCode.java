package com.hlz.gourdmall.enums;

/**
 * @author: Davion
 * @date: 2019/11/25
 * @description:
 */
public enum ResultCode {
    // 返回结果状态集
    SEND_CODE_SUCCESS(2000, "验证码发送成功"),
    SEND_ERROR(5000, "验证码发送失败"),
    SNO_ALREADY_EXIST(5001, "学号已注册"),
    CONFIRM_SUCCESS(2100, "验证码正确"),
    CONFIRM_FAIL(4100, "验证码错误"),
    SNO_NO_MARCH(4101, "学号不匹配"),
    USER_NOT_EXIST(4400, "用户不存在"),
    PASSWORD_SET_SUCCESS(2200, "密码设置成功"),
    PASSWORD_SET_FAIL(4200, "密码设置失败"),
    LOGIN_SUCCESS(2300, "登录成功"),
    LOGIN_FAIL(4300, "登录失败"),
    ;

    private Integer code;
    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}