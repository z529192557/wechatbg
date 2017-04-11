package com.wechatbg.home.controller;

import java.io.Serializable;

/**
 * @author zhuangpeng
 * @Type ResponseVO
 * @Desc 响应对象
 * @date 2017/4/12
 * @Version V1.0
 */
public class ResponseVO<T> implements Serializable {
    private static final long serialVersionUID = -3210810443272569988L;
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 响应码
     */
    private String code;
    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    public static<F> ResponseVO<F> getSuccessResponse(F data) {
        ResponseVO<F> response = new ResponseVO<F>();

        response.setData(data);
        response.setCode("0");
        response.setSuccess(true);
        response.setMessage("操作成功");

        return response;
    }

    public static<F> ResponseVO<F> getFailResponse(String errCode, String errMsg) {
        ResponseVO<F> response = new ResponseVO<F>();

        response.setCode(errCode);
        response.setSuccess(false);
        response.setMessage(errMsg);

        return response;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
