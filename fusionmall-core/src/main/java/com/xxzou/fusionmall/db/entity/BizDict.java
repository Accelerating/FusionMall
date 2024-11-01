package com.xxzou.fusionmall.db.entity;


import lombok.Data;

import java.util.Date;

@Data
public class BizDict {

  private long id;
  private String dictName;
  private String dictGroup;
  private String dictKey;
  private String dictValue;
  private String parentGroup;
  private String parentKey;
  private long sort;
  private String remark;
  private Date ctime;
  private Date utime;



}
