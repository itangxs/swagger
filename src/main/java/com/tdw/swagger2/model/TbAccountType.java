package com.tdw.swagger2.model;

import java.util.Date;

/**
 * @author tangxs
 * @date 2017/11/15
 */
public class TbAccountType {

    /**
     *账户类型编号
     */
    private  Integer accountTypeId;
    /**
     *账户类型名称
     */
    private  String accountTypeName;
    /**
     *状态1:开启0:关闭
     */
    private  Integer statusFlag;
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

    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public Integer getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Integer statusFlag) {
        this.statusFlag = statusFlag;
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
}
