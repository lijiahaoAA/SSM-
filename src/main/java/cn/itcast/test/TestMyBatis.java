package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @Author: lijiahao
 * @Description:
 * @Data: Create in 18:52 2020/1/19
 * @Modified By:
 */
public class TestMyBatis {

    /**
     *@Description:测试查询
     *@Date: 19:18 2020/1/19
     *@param
     *@return
     */
    @Test
    public void run2() throws IOException {

        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory=  new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //获取到代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //查询所有数据
        List<Account> list = dao.findAll();
        for(Account account : list){
            System.out.println(account);
        }
        //关闭资源
        sqlSession.close();
        in.close();
    }

    /**
     *@Description:测试存储
     *@Date: 19:19 2020/1/19
     *@param
     *@return
     */
    @Test
    public void run3() throws IOException {
        Account account = new Account();
        account.setName("老李");
        account.setMoney(5000d);
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory=  new SqlSessionFactoryBuilder().build(in);
        //创建sqlsession对象
        SqlSession sqlSession = factory.openSession();
        //获取到代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //查询所有数据
        List<Account> list = dao.findAll();
        for(Account account1 : list){
            System.out.println(account);
        }
        //提交事务
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
        in.close();
    }
}
