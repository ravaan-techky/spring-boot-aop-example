package com.ravaan.techky.aop.example.aop;

import java.time.Instant;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodLoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(MethodLoggingAspect.class);

	/* @Before("execution(* com.ravaan.techky.aop.example.service.impl.*.*(..))") */
	@Before("within(com.ravaan.techky.aop.example.service..*)")
	public void beforeMethod(JoinPoint joinPoint) {
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append(" Before ");
		messageBuilder.append(joinPoint.getSignature().getName());
		messageBuilder.append(" with arguments " + Arrays.toString(joinPoint.getArgs()));
		LOGGER.info(messageBuilder.toString());
	}

	/*
	 * @AfterReturning(pointcut =
	 * "execution(* com.ravaan.techky.aop.example.service.impl.*.*(..))", returning
	 * = "result")
	 */
	@AfterReturning(pointcut = "within(com.ravaan.techky.aop.example.service..*)", returning = "result")
	public void afterMethod(JoinPoint joinPoint, Object result) {
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append(" After ");
		messageBuilder.append(joinPoint.getSignature().getName());
		messageBuilder.append(" with result " + result);
		LOGGER.info(messageBuilder.toString());
	}

	/**
	 * Around method.
	 *
	 * @param proceedingJoinPoint the proceeding join point
	 * @return the object
	 * @throws Throwable the throwable
	 */
	@Around("within(com.ravaan.techky.aop.example..*)")
	public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		StringBuilder messageBuilder = new StringBuilder();
		Long startTime = Instant.now().toEpochMilli();
		Object result = proceedingJoinPoint.proceed();
		Long endTime = Instant.now().toEpochMilli();
		messageBuilder.append(proceedingJoinPoint.getSignature().getDeclaringType().getName()).append(".")
				.append(proceedingJoinPoint.getSignature().getName()).append(" Time difference is ")
				.append((endTime - startTime)).append(" Milliseconds.");
		LOGGER.info(messageBuilder.toString());
		return result;
	}
	
	/**
	 * After throwing method.
	 *
	 * @param throwable the throwable
	 */
	@AfterThrowing(pointcut = "execution(* com.ravaan.techky.aop.example.service.impl.*.*(..))", throwing = "throwable")
	public void afterThrowingMethod(Throwable throwable) {
		LOGGER.error("Exception in Service Layer. Reason - " + throwable.getLocalizedMessage(), throwable);
	}

}
