package pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ClassName: User
 * Function:  TODO
 * Date:      2019/12/15 19:19
 * author     14746
 * version    V1.0
 */
public class User implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("set username");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        System.out.println("set password");
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware");
    }

    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware");
    }

    public void init() {
        System.out.println("init");
    }

    public void myDestory() {
        System.out.println("destory");
    }

    public void setBeanName(String s) {
        System.out.println("BeanNameAware");
    }
}
