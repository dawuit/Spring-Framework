package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * ClassName: AopConfig
 * Function:  TODO
 * Date:      2020/2/21 13:59
 * author     14746
 * version    V1.0
 */
@Aspect
public class AopConfig {
    @Pointcut("execution(* service.impl..*.*(..))")
    public void PointCut(){

    }

    @Before("PointCut()")
    public void Before(){
        System.out.println("dog before1");
    }

    @AfterReturning("PointCut()")
    public void AfterReturn(){
        System.out.println("dog AfterReturn");
    }

    @AfterThrowing("PointCut()")
    public void AfterThrow(){
        System.out.println("dog AfterThrow");
    }

    @Around("PointCut()")
    public void Around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("---start---");
        joinPoint.proceed();
        System.out.println("---end---");
    }

    @After("PointCut()")
    public void After(){
        System.out.println("dog after");
    }
}
