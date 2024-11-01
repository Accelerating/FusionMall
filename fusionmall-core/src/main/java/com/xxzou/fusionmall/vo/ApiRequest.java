package com.xxzou.fusionmall.vo;

import lombok.Data;

/**
 * @author zxx
 */
@Data
public class ApiRequest<T> {

    private long timestamp;
    private String sign;
    private T params;

}
