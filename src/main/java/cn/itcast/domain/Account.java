package cn.itcast.domain;

/**
 * @Author: lijiahao
 * @Description: 账户信息javabean
 * @Data: Create in 12:56 2020/1/19
 * @Modified By:
 */

public class Account {
    private String name;
    private Integer id;
    private Double money;

    public String getName() {
        return name;
    }

     public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", money=" + money +
                '}';
    }
}
