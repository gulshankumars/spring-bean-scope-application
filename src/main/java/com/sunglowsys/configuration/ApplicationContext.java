package com.sunglowsys.configuration;

import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Student;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationContext {

    @Bean("student")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Student getSStudent(){
        return new Student();
    }


    @Bean("address")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Address getAddress() {
        return new Address();
    }

}