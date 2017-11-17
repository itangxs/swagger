package com.tdw.swagger2.model;

import java.util.Date;

/**
 * @author tangxs
 * @date 2017/11/15
 * 帐号银行卡
 */
public class TbAccountBankCard {

    /**
     *账户银行卡编号guid
     */
    private  String accountBankId;
    /**
     *账户编号
     */
    private  String accountId;
    /**
     *银行账号
     */
    private  String bankCardNo;
    /**
     *开户行
     */
    private  String openBank;
    /**
     *开户支行
     */
    private  String openSubBank;
    /**
     *银行卡归属地省
     */
    private  String bankProvince;
    /**
     *银行卡归属地市
     */
    private  String bankCity;
    /**
     *银行卡预留手机号码
     */
    private  String phoneNumber;
    /**
     *创建用户
     */
    private  String createUser;
    /**
     *创建时间
     */
    private  Date createTime;
    /**
     *更新用户
     */
    private  String updateUser;
    /**
     *更新时间
     */
    private Date updateTime;
    /**
     *状态1:可用,0:不可用
     */
    private  Integer statusFlag;
    /**
     *备注
     */
    private  String remark;
    /**
     *是否主卡,1:主卡,0:副卡
     */
    private  Integer mainFlag;
    /**
     *是否注册了存管,1.是,0:否
     */
    private  Integer cunguanFlag;

    public String getAccountBankId() {
        return accountBankId;
    }

    public void setAccountBankId(String accountBankId) {
        this.accountBankId = accountBankId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public String getOpenSubBank() {
        return openSubBank;
    }

    public void setOpenSubBank(String openSubBank) {
        this.openSubBank = openSubBank;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public Integer getMainFlag() {
        return mainFlag;
    }

    public void setMainFlag(Integer mainFlag) {
        this.mainFlag = mainFlag;
    }

    public Integer getCunguanFlag() {
        return cunguanFlag;
    }

    public void setCunguanFlag(Integer cunguanFlag) {
        this.cunguanFlag = cunguanFlag;
    }
}
