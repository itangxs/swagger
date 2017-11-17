package com.tdw.swagger2.suports;

/**
 * @author tangxs
 * @date 2017/11/15
 * 消息结果
 */
public class ResultMessage {

    /**
     * 结果编号
     */
    private Integer code;

    /**
     * 结果描述
     */
    private String message;

    /**
     * 结果
     */
    private Object data;

    public ResultMessage(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public ResultMessage setResultMessage(ErrorCode errorCode){
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultMessage{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
