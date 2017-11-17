package com.tdw.swagger2.dao.master;

import com.tdw.swagger2.model.TbAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tangxs
 * @date 2017/11/17
 */
@Mapper()
public interface TbAccountDao {

    /**
     * 查询所有账户
     * @return
     */
    List<TbAccount> findAll();
    /**
     *  根据账户id 查询账户信息
     * @param accountId
     * @return
     */
    TbAccount findByAccountId(@Param("accountId")String accountId);

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
    Integer deleteAccount(@Param("accountId")String accountId);
}
