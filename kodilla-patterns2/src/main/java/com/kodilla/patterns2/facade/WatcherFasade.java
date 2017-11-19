package com.kodilla.patterns2.facade;

import com.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.weaver.ast.Or;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherFasade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherFasade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(orderDto, userId)&& target(object) " )
    public void logEvent2(OrderDto orderDto, Long userId, Object object){
        LOGGER.info("\n\nClass: " + object.getClass() + " , ARGS: \nOrderDto orderDto: " + orderDto.toString()+ "\nClass: " + object.getClass() + " Long userId: " + userId + "\n");
    }
}