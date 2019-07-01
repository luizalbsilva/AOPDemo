package br.com.tamanhofamilia.demos.proxy.AOPDemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAspect.class);
	
    @Around("execution(* br.com.tamanhofamilia.demos.proxy.AOPDemo.components.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
    	String canonicalName = this.getClass().getCanonicalName();
		String propriedade = joinPoint.getTarget().getClass().getCanonicalName() + "#" + joinPoint.getSignature().getName();
		LOGGER.info("Finalizando chamada de " + canonicalName + " sendo chamado.\nProxy de "+ propriedade );
        
        final Object proceed = joinPoint.proceed();

		LOGGER.info("Finalizando chamada de " + canonicalName + " sendo chamado.\nProxy de "+ propriedade );
        return proceed;

    }

}
