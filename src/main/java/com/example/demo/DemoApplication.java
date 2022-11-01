package com.example.demo;

import com.example.demo1.Dereje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo1")
//We have to scan the other from the same class otherwise it is no gonna work
@ComponentScan("com.example.demo")
public class DemoApplication {

    private static Tsigab tsigab;
    private static Dereje dj;
    @Autowired
    public DemoApplication(Tsigab t, Dereje dj){
        this.tsigab= t;
        this.dj= dj;
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
       // System.out.println("Hello World");
        tsigab.printer();
        dj.printDj();
    }

}
