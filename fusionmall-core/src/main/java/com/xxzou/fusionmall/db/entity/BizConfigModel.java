package com.xxzou.fusionmall.db.entity;


import lombok.Data;

import java.util.Date;

@Data
public class BizConfigModel {

  private long id;
  private String modelName;
  private String modelKey;
  private String configModel;
  private String remark;
  private Date ctime;
  private Date utime;

}
