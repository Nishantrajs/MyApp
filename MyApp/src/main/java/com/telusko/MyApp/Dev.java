package com.telusko.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev
{
    @Autowired
    @Qualifier("desktop")
    private Computer computer;

    /*private Laptop laptop; Constructor Injection (Better to use)
    public Dev(Laptop laptop)
    {
        this.laptop = laptop;
    }
   private Laptop laptop;
    @Autowired                            // Setter Injection
    public void SetLaptop(Laptop laptop) // Better to use
    {
        this.laptop = laptop;
    }*/

    public void build()
    {
        computer.compile();

        System.out.println("Working on Awesome Project");
    }
}
