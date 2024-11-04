package com.telusko.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer
{

    @Override
    public void compile()
    {
        System.out.println("Desktop Works Faster and is Cheaper");
    }
}
