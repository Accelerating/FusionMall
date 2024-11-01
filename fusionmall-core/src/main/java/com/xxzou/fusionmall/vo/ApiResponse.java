package com.xxzou.fusionmall.vo;

import lombok.Data;

/**
 * @author zxx
 */
@Data
public class ApiResponse<T> {

    private int code;
    private String msg;
    private T data;

}
