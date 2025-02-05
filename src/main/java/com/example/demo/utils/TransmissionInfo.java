package com.example.demo.utils;

public class TransmissionInfo {
    private String status;
    private String message;
    private Object data;

    // 无参构造函数
    public TransmissionInfo() {
    }

    // 全参构造函数
    public TransmissionInfo(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // Getter 和 Setter 方法
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    // toString 方法
    @Override
    public String toString() {
        return "TransmissionInfo{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}