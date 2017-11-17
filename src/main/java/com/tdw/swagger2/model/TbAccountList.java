package com.tdw.swagger2.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author tangxs
 * @date 2017/11/15
 *
 */
public class TbAccountList {

    /**
     *明细编号
     */
    private  Integer listId;
    /**
     *账户编号
     */
    private  String accountId;
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

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getAccountBankId() {
        return accountBankId;
    }

    public void setAccountBankId(String accountBankId) {
        this.accountBankId = accountBankId;
    }

    public String getFeeId() {
        return feeId;
    }

    public void setFeeId(String feeId) {
        this.feeId = feeId;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public Integer getInOut() {
        return inOut;
    }

    public void setInOut(Integer inOut) {
        this.inOut = inOut;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
