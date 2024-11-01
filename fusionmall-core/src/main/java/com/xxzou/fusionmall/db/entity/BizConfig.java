package com.xxzou.fusionmall.db.entity;


import lombok.Data;

import java.util.Date;

@Data
public class BizConfig {

  private long id;
  private String modelKey;
  private String configName;
  private String configKey;
  private String configValue;
  private long version;
  private String remark;
  private Date ctime;
  private Date utime;



}
