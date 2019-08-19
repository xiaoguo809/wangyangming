package com.bgy.customerwaterscore.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContextAwareTest implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public  ApplicationContext getApplicationContext(){
        return this.applicationContext;
    }

    public  void  showALLBeans(){
         ApplicationContext app= this.getApplicationContext();
         String[] s= app.getBeanDefinitionNames();
         for(String name:s){
             System.out.println(name);
         }
    }
}
