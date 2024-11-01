package com.xxzou.fusionmall.common;

import lombok.Data;

import java.util.List;

@Data
public class Trace {

    private List<Source> sources;
    private String traceId;

    @Data
    public static class Source{
        private String host;
        private String ip;
        private String app;
    }

}
