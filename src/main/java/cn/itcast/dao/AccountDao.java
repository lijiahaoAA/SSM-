package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: lijiahao
 * @Description:帐户Dao接口
 * @Data: Create in 13:02 2020/1/19
 * @Modified By:
 */
public interface AccountDao {


    //查询所有账户
    @Select("select * from account")
    public List<Account> findAll();

    //保存账户信息
    @Select("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);
}
