package com.tdw.swagger2.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author tangxs
 * @date 2017/11/15
 *
 */
public class TbAccountListDto {

    /**
     *账户编号
     */
    private  String accountId;

    /**
     * 是否为交易明细
     */
    private Integer isTransactiondetails;
    /**
     *记账日期
     */
    private Date accountTime;
    /**
     *业务编号
     */
    private  String businessId;
    /**
     *记账金额
     */
    private BigDecimal amount;
    /**
     *银行账号
     */
    private  String bankCardNo;
    /**
     *账户银行卡编号guid
     */
    private  String accountBankId;
    /**
     *费用项目
     */
    private  String feeId;
    /**
     *交易活动,0满标分润,1提现放款...
     */
    private  Integer actionId;
    /**
     *收支类型,0支出,1收入
     */
    private  Integer inOut;
    /**
     *创建用户
     */
    private  String createUser;
    /**
     *创建时间
     */
    private  Date createTime;
    /**
     *状态
     */
    private  Integer statusFlag;
    /**
     *备注
     */
    private  String remark;

}
