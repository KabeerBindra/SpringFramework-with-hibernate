package data;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class Advice implements MethodBeforeAdvice, AfterReturningAdvice {
	public SecondaryJob second;
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        second.reward();
		
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
System.out.println("i was cALLED BEFORE");
		second.authenticate(args[1].toString());
		second.checkSeats(args[0].toString());
	}

	public void setSecond(SecondaryJob second) {
		this.second = second;
	}
}
