package com.tdw.swagger2.suports;

/**
 * @author  tangxs
 * @date  2017/11/15
 * 错误消息
 */
public enum ErrorCode {

    /**
     *  200, "服务正常"
     */
    ACCOUNT_SERVICE_OK(200, "服务调用正常"),
    /**
     *  400, "服务异常，请联系管理员"
     */
    ACCOUNT_SERVICE_ERROR(400, "服务异常，请联系管理员"),
    /**
     *  401, "必填信息为空"
     */
    ACCOUNT_SERVICE_REQUIRED_FIELD_IS_NULL(4001, "必填信息为空");


    private String message;
    private Integer code;

    ErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
