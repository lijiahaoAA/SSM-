package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: lijiahao
 * @Description:帐户web
 * @Data: Create in 13:08 2020/1/19
 * @Modified By:
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    /*依赖注入，自动注入，进入service层*/
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层:查询所有的账户信息。。。");
        //调用业务层service层方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request,HttpServletResponse response) throws IOException {
        System.out.println("表现层:查询所有的账户信息。。。");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
