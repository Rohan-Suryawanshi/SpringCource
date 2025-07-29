
package com.factorydesignpattern;

import com.factorydesignpattern.beans.EmployeeBean;
import com.factorydesignpattern.beans.StudentBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class FactoryDesignPattern {

    public static void main(String[] args) {
//        FileSystemResource res=new FileSystemResource("src\\main\\java\\com\\factorydesignpattern\\config\\applicationContext.xml");
//        XmlBeanFactory factory=new XmlBeanFactory(res);
        
        DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
        
        reader.loadBeanDefinitions(new FileSystemResource("src/main/java/com/factorydesignpattern/config/applicationContext.xml"));
        
        StudentBean obj=factory.getBean("student-1",StudentBean.class);
        EmployeeBean obj1=factory.getBean("employee-1",EmployeeBean.class);
        
//        StudentBean stud=(StudentBean)obj;
//        EmployeeBean emp=(EmployeeBean)obj1;
        System.out.println(obj);
        System.out.println(obj1);
    }
}
