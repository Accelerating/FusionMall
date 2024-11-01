package com.xxzou.fusionmall.db.entity;


import com.xxzou.fusionmall.util.DateTime;
import lombok.Data;

@Data
public class UserOrder {

  private long id;
  private long uid;
  private long orderId;
  private long status;
  private String itemId;
  private long itemQuantity;
  private String itemCurrency;
  private long itemPrice;
  private String paidCurrency;
  private long paidAmount;
  private String payerAccount;
  private String receiptAccount;
  private String transactionId;
  private long outerOrderId;
  private String bizId;
  private String bizType;
  private DateTime bizData;
  private DateTime payTime;
  private DateTime refundTime;
  private DateTime ctime;
  private DateTime utime;
  private String extra;


}
