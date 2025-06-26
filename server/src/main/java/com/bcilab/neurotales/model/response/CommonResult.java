package com.bcilab.neurotales.model.response;
// Description: 所有HTTP返回的封装模型

import lombok.Data;

@Data
public class CommonResult {
    private Integer code;   //200代表成功，202代表接受，400代表失败，403代表token失效，405代表无权限
    private String message; //提示信息
    private Object data;    //返回数据

    private static final Integer CODE_SUCCESS = 200;

    private static final Integer CODE_ACCEPTED = 202;

    private static final Integer CODE_FAIL = 400;

    private static final Integer CODE_EXPIRE = 403;

    private static final Integer CODE_UNAUTHORIZED = 405;

    private static final String MSG_SUCCESS = "success";

    private static final String MSG_ACCEPTED = "accepted";

    private static final String MSG_FAIL = "failed";

    private static final String MSG_EXPIRE = "token_expire";

    private static final String MSG_UNAUTHORIZED = "unauthorized";

    public CommonResult(){
    }
    public CommonResult(Integer code ){
        this.code=code;
    }
    public CommonResult(Integer code,Object data){
        this.code=code;
        this.data=data;
    }
    public CommonResult(Integer code, String msg){
        this.code = code;
        this.message = msg;
    }
    public CommonResult(Integer code, String msg,Object data) {
        this.code = code;
        this.message = msg;
        this.data=data;
    }
    public static CommonResult success(){
        return new CommonResult(CODE_SUCCESS,MSG_SUCCESS);
    }

    public static CommonResult success(String msg){
        return new CommonResult(CODE_SUCCESS,msg);
    }

    public static CommonResult success(Object data){
        return new CommonResult(CODE_SUCCESS,MSG_SUCCESS,data);
    }

    public static CommonResult success(String msg,Object data){
        return new CommonResult(CODE_SUCCESS,msg,data);
    }

    public static CommonResult success(Integer code,String msg,Object data){
        return new CommonResult(code,msg,data);
    }

    public static CommonResult accepted(){
        return new CommonResult(CODE_ACCEPTED,MSG_ACCEPTED);
    }

    public static CommonResult accepted(String msg){
        return new CommonResult(CODE_ACCEPTED,msg);
    }

    public static CommonResult accepted(Object data){
        return new CommonResult(CODE_ACCEPTED,MSG_SUCCESS,data);
    }

    public static CommonResult accepted(String msg,Object data){
        return new CommonResult(CODE_ACCEPTED,msg,data);
    }

    public static CommonResult accepted(Integer code,String msg,Object data){
        return new CommonResult(code,msg,data);
    }

    public static CommonResult fail(){
        return new CommonResult(CODE_FAIL, MSG_FAIL);
    }
    //自定义code、msg、data
    public static CommonResult fail(Integer code, String msg,Object data){
        return new CommonResult(code, msg, data);
    }

    public static CommonResult fail(String msg){
        return new CommonResult(CODE_FAIL, msg);
    }

    public static CommonResult fail(String msg,Object data){
        return new CommonResult(CODE_FAIL, msg,data);
    }

    public static CommonResult expire(){
        return new CommonResult(CODE_EXPIRE,MSG_EXPIRE);
    }

    public static CommonResult unauthorized(){
        return new CommonResult(CODE_UNAUTHORIZED,MSG_UNAUTHORIZED);
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
