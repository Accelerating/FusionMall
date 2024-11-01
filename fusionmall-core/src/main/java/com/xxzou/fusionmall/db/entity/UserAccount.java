package com.xxzou.fusionmall.db.entity;


import com.xxzou.fusionmall.common.DateTime;
import lombok.Data;

@Data
public class UserAccount {

  private long id;
  private long uid;
  private long status;
  private DateTime ctime;
  private DateTime utime;
  private String extra;

}
