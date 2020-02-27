package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * ClassName: AopConfig
 * Function:  TODO
 * Date:      2020/2/21 13:59
 * author     14746
 * version    V1.0
 */
@Aspect
public class AopConfigTmp {
    @Pointcut("execution(* service.impl..*.*(..))")
    public void PointCut(){

    }

    @Before("PointCut()")
    public void Before(){
        System.out.println("t dog before1");
    }

    @AfterReturning("PointCut()")
    public void AfterReturn(){
        System.out.println("t dog AfterReturn");
    }

    @AfterThrowing("PointCut()")
    public void AfterThrow(){
        System.out.println("t dog AfterThrow");
    }

    @Around("PointCut()")
    public void Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("t---start---");
        joinPoint.proceed();
        System.out.println("t---end---");
    }

    @After("PointCut()")
    public void After(){
        System.out.println("t dog after");
    }
}
