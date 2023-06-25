package com.example.demo.model;

public class Response {
    
    private boolean success;
    private int code;
   
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public Response(){
        success = true;
        code = 0;
    }
}
