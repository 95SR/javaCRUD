package com.example.demo.model;

public class GenericResponse<T> extends Response {
    
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
