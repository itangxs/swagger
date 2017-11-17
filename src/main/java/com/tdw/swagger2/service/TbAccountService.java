package com.tdw.swagger2.service;

import com.tdw.swagger2.model.TbAccount;

import java.util.List;

/**
 *    @author tangxs
 *    @date   2017/11/17
 */
public interface TbAccountService {

    /**
     * 查询所有账户
     * @return
     */
    List<TbAccount> findAll();
    /**
     *      根据账户id 查询账户信息，以及从库 账户类型
     * @param id
     * @return
     */
    TbAccount findByAccountId(String id);

    /**
     * 新增账户
     * @param account
     * @return
     */
    Integer insertAccount(TbAccount account);

    /**
     * 更新账户
     * @param account
     * @return
     */
    Integer updateAccount(TbAccount account);
    /**
     *  根据账户id 删除账户信息
     * @param accountId
     * @return
     */
    /**
     *  根据账户id 删除账户信息
     * @param accountId
     * @return
     */
    Integer deleteAccount(String accountId);
}
