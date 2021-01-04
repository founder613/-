package com.bjpowernode.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 项目如果前后端分离开发，传给前端一个json
 * 那么此类是json格式的封装体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String message;
    private T data;//传到前端的实体类数据

    public CommonResult(Integer code,String message) {
        this.code=code;
        this.message=message;

    }
}
