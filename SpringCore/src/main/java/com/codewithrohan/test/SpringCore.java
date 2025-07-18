package com.codewithrohan.test;

import com.codewithrohan.beans.WishMessageGenerator;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringCore {

    public static void main(String[] args) {
        // Load Spring config from the classpath
        FileSystemResource fs = new FileSystemResource("src/main/java/com/codewithrohan/confg/applicationContext.xml");
        
        // Create the IOC container         
        XmlBeanFactory bean = new XmlBeanFactory(fs);
        
        // Getting the targert Bean Class Object
        WishMessageGenerator wsmg = (WishMessageGenerator) bean.getBean("wmsg");

        // Call the method
        String message = wsmg.generateWishMessage("Rohan");

        System.out.println(message);
    }
}
