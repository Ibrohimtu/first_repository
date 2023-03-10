package uz.brogrammers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shape shape = context.getBean("rectangel", Shape.class);
        System.out.println(shape.area());

        context.close();
    }
}
