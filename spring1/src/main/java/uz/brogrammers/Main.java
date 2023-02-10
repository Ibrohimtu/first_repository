package uz.brogrammers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean=context.getBean("testbean",TestBean.class);
        System.err.println(testBean.getName());
        context.close();
    }
}
