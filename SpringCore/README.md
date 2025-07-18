# Spring Core - Wish Message Generator

A simple Spring Framework application that demonstrates Inversion of Control (IoC) and Dependency Injection concepts by generating time-based greeting messages.

## 📋 Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [How to Run](#how-to-run)
- [Code Explanation](#code-explanation)
- [Learning Objectives](#learning-objectives)

## 🎯 Overview

This project showcases basic Spring Framework concepts by creating a simple application that generates personalized greeting messages based on the current time of day. It demonstrates how Spring manages object creation and dependency injection through XML configuration.

## 📁 Project Structure

```
SpringCore/
├── pom.xml                                    # Maven configuration
├── README.md                                  # This file
└── src/
    └── main/
        └── java/
            └── com/
                └── codewithrohan/
                    ├── beans/
                    │   └── WishMessageGenerator.java    # Business logic bean
                    ├── confg/
                    │   └── applicationContext.xml       # Spring configuration
                    └── test/
                        └── SpringCore.java              # Main application class
```

## ✨ Features

- **Time-based Greetings**: Generates appropriate messages based on current time
  - Good Morning (before 12 PM)
  - Good Afternoon (12 PM - 4 PM)
  - Good Evening (4 PM - 8 PM)
  - Good Night (after 8 PM)
- **Spring IoC Container**: Demonstrates dependency injection
- **XML Configuration**: Uses traditional Spring XML configuration
- **Maven Build**: Standard Maven project structure

## 🛠️ Technologies Used

- **Java 17**: Programming language
- **Spring Framework 4.3.9**: IoC container and dependency injection
- **Maven**: Build and dependency management
- **Commons Logging 1.2**: Logging framework

## 📋 Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven 3.6 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

## 🚀 How to Run

### Using Maven

1. **Clone or download the project**
   ```cmd
   cd d:\Spring\SpringCore
   ```

2. **Compile the project**
   ```cmd
   mvn compile
   ```

3. **Run the application**
   ```cmd
   mvn exec:java -Dexec.mainClass="com.codewithrohan.test.SpringCore"
   ```

### Using IDE

1. Import the project as a Maven project
2. Wait for dependencies to download
3. Run the `SpringCore.java` class as a Java application

### Expected Output

The application will display a time-appropriate greeting message:
```
Good Morning Rohan
```
*(Output varies based on current time)*

## 📚 Code Explanation

### 1. WishMessageGenerator.java (Bean Class)

```java
public class WishMessageGenerator {
    private Date date;  // Injected by Spring
    
    public String generateWishMessage(String name) {
        // Logic to determine greeting based on current hour
    }
}
```

**Purpose**: Contains the business logic for generating time-based greetings.

**Key Features**:
- Uses setter injection for Date dependency
- Determines greeting based on hour of the day
- Returns personalized message with user's name

### 2. applicationContext.xml (Spring Configuration)

```xml
<bean id="dt" class="java.util.Date" />
<bean id="wmsg" class="com.codewithrohan.beans.WishMessageGenerator">
    <property name="date" ref="dt"/>     
</bean>
```

**Purpose**: Defines Spring beans and their dependencies.

**Configuration**:
- Creates a Date bean with current timestamp
- Creates WishMessageGenerator bean
- Injects Date dependency into WishMessageGenerator

### 3. SpringCore.java (Main Application)

```java
public static void main(String[] args) {
    // Load Spring configuration
    FileSystemResource fs = new FileSystemResource("...");
    XmlBeanFactory bean = new XmlBeanFactory(fs);
    
    // Get bean and call method
    WishMessageGenerator wsmg = (WishMessageGenerator) bean.getBean("wmsg");
    String message = wsmg.generateWishMessage("Rohan");
}
```

**Purpose**: Bootstrap the Spring application and demonstrate IoC.

**Process**:
1. Loads Spring XML configuration
2. Creates IoC container
3. Retrieves configured bean
4. Executes business logic

### 4. pom.xml (Maven Configuration)

**Dependencies**:
- `spring-context`: Core Spring functionality
- `commons-logging`: Required logging framework

## 🎓 Learning Objectives

This project demonstrates the following Spring concepts:

1. **Inversion of Control (IoC)**: Spring container manages object lifecycle
2. **Dependency Injection**: Date object injected into WishMessageGenerator
3. **XML Configuration**: Traditional Spring configuration approach
4. **Bean Management**: Spring creates and wires objects automatically
5. **Separation of Concerns**: Business logic separated from configuration

## 📝 Notes

- The project uses `XmlBeanFactory` which is deprecated in newer Spring versions
- For modern applications, consider using `ApplicationContext` or annotation-based configuration
- The `date.getHours()` method is deprecated; consider using `java.time` API for new projects

## 🤝 Contributing

Feel free to fork this project and submit pull requests for improvements or bug fixes.

## 📄 License

This project is for educational purposes and is open source.

---

**Author**: CodeWithRohan  
**Created**: July 18, 2025  
**Spring Version**: 4.3.9.RELEASE
