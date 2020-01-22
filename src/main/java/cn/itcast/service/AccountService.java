package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @Author: lijiahao
 * @Description:
 * @Data: Create in 13:05 2020/1/19
 * @Modified By:
 */
public interface AccountService {

    //查询所有账户
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account account);
}
