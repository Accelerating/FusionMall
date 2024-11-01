package com.xxzou.fusionmall.db.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ConfigLog {

  private long id;
  private String configType;
  private String configKey;
  private String configBeforeValue;
  private String configAfterValue;
  private long configVersion;
  private String configModelKey;
  private String configModelValue;
  private long configModelVersion;
  private Date ctime;
  private Date utime;
  private String operator;

}
