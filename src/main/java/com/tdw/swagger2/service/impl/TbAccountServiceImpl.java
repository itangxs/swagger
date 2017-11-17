package com.tdw.swagger2.service.impl;

import com.tdw.swagger2.dao.master.TbAccountDao;
import com.tdw.swagger2.model.TbAccount;
import com.tdw.swagger2.service.TbAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tangxs
 * @date 2017/11/17
 */
@Service
public class TbAccountServiceImpl implements TbAccountService {


    @Autowired
    private TbAccountDao tbAccountDao;

    /**
     * 查询所有账户
     *
     * @return
     */
    @Override
    public List<TbAccount> findAll() {
        return tbAccountDao.findAll();
    }

    /**
     * 根据账户id 查询账户信息，以及从库 账户类型
     *
     * @param id
     * @return
     */
    @Override
    public TbAccount findByAccountId(String id) {
        TbAccount account = tbAccountDao.findByAccountId(id);

        return account;
    }

    /**
     * 新增账户
     *
     * @param account
     * @return
     */
    @Override
    public Integer insertAccount(TbAccount account) {
        return tbAccountDao.insertAccount(account);
    }

    /**
     * 更新账户
     *
     * @param account
     * @return
     */
    @Override
    public Integer updateAccount(TbAccount account) {
        return tbAccountDao.updateAccount(account);
    }

    /**
     * 根据账户id 删除账户信息
     *
     * @param accountId
     * @return
     */
    @Override
    public Integer deleteAccount(String accountId) {
        return tbAccountDao.deleteAccount(accountId);
    }
}
