package com.itheima.controller.utils;

import lombok.Data;

/**
 * @author: Java_cmr
 * @Date: 2023/3/1 - 14:28
 */

@Data
public class R {
    private boolean flag;
    private Object data;

    private String message;

    public R(){}
    public R(boolean flag){
        this.flag = flag;
    }

    public R(boolean flag, Object o){
        this.flag = flag;
        this.data = o;
    }

    public R(boolean flag, String s){
        this.flag = flag;
        this.message = s;
    }


    public R(String s){
        this.flag = flag;
        this.message = s;
    }
}
