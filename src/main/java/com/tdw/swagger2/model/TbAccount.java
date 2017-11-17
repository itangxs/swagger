package com.tdw.swagger2.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author tangxs
 * @date 2017/11/15
 *  账户表
 */
public class TbAccount {

    /**
     *账户编号guid
     */
    private  String accountId;
    /**
     *账户号码,帐号标识
     */
    private  String accountNo;

    /**
     *账户类型表账户编号0:借款人账户1:分公司账户...
     */
    private  Integer accountType;
    /**
     *账户名称
     */
    private  String accountName;
    /**
     *账户主体编号,个人是身份证,企业是统一信用编码或者营业执照
     */
    private  String mainId;
    /**
     *账户主体编号,1;个人,2:企业
     */
    private  Integer mainType;
    /**
     *所属资产端,1:鸿特,2:一点车贷...
     */
    private  Integer businessFrom;
    /**
     *所属分公司
     */
    private  String branchId;
    /**
     *可用余额
     */
    private  BigDecimal accountAmount;
    /**
     *冻结余额
     */
    private BigDecimal frozenAmount;
    /**
     *账户状态,1:启用,0:禁用
     */
    private  Integer statusFlag;
    /**
     *账户是否被冻结,1:冻结,0:未冻结
     */
    private  Integer frozenFlag;
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
     *备注
     */
    private  String remark;


    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    public Integer getMainType() {
        return mainType;
    }

    public void setMainType(Integer mainType) {
        this.mainType = mainType;
    }

    public Integer getBusinessFrom() {
        return businessFrom;
    }

    public void setBusinessFrom(Integer businessFrom) {
        this.businessFrom = businessFrom;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public BigDecimal getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(BigDecimal accountAmount) {
        this.accountAmount = accountAmount;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    public Integer getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
    }

    public Integer getFrozenFlag() {
        return frozenFlag;
    }

    public void setFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TbAccount{" +
                "accountId='" + accountId + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", accountType=" + accountType +
                ", accountName='" + accountName + '\'' +
                ", mainId='" + mainId + '\'' +
                ", mainType=" + mainType +
                ", businessFrom=" + businessFrom +
                ", branchId='" + branchId + '\'' +
                ", accountAmount=" + accountAmount +
                ", frozenAmount=" + frozenAmount +
                ", statusFlag=" + statusFlag +
                ", frozenFlag=" + frozenFlag +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", updateUser='" + updateUser + '\'' +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
