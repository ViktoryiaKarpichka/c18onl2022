package tms.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(public * tms.service.UserService.*(..))")
    public void userServiceMethods() {
    }
}
