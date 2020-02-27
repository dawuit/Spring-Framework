package config;

import org.springframework.aop.Advisor;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.aspectj.AspectJAfterAdvice;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;

import java.lang.reflect.Method;

/**
 * ClassName: SpringConfig
 * Function:  TODO
 * Date:      2020/2/21 14:24
 * author     14746
 * version    V1.0
 */
@ComponentScan({"service"})
@EnableAspectJAutoProxy
@Configuration
@EnableAsync
public class SpringConfig {
    @Bean
    public AopConfig aopConfig(){
        return new AopConfig();
    }

    @Bean
    public AopConfigTmp aopConfigTmp(){
        return new AopConfigTmp();
    }

    @Bean
    public Advisor advisor1(){
        return new DefaultPointcutAdvisor(new MethodBeforeAdvice() {
			@Override
			public void before(Method method, Object[] args, Object target) throws Throwable {
				System.out.println("ok");
			}
		});
    }
}
