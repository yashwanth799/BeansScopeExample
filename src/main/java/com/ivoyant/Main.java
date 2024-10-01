package com.ivoyant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Singleton example
        System.out.println("=== Singleton Scope ===");
        Engine engine1 = context.getBean("engineSingleton", Engine.class);
        Engine engine2 = context.getBean("engineSingleton", Engine.class);
        System.out.println("Are both singleton engines same? " + (engine1 == engine2)); // true

        // Prototype example
        System.out.println("\n=== Prototype Scope ===");
        Engine protoEngine1 = context.getBean("enginePrototype", Engine.class);
        Engine protoEngine2 = context.getBean("enginePrototype", Engine.class);
        System.out.println("Are both prototype engines same? " + (protoEngine1 == protoEngine2)); // false

        // Request and session scopes would normally be tested in a web context.
        // Here we'll just demonstrate their creation.
       /* System.out.println("\n=== Request Scope (for web context) ===");
        Engine reqEngine1 = context.getBean("engineRequest", Engine.class);
        Engine reqEngine2 = context.getBean("engineRequest", Engine.class);
        System.out.println("Are both request engines same? " + (reqEngine1 == reqEngine2)); // false

        System.out.println("\n=== Session Scope (for web context) ===");
        Engine sessionEngine1 = context.getBean("engineSession", Engine.class);
        Engine sessionEngine2 = context.getBean("engineSession", Engine.class);
        System.out.println("Are both session engines same? " + (sessionEngine1 == sessionEngine2)); // false

        // Application example (same as singleton in a single application context)
        System.out.println("\n=== Application Scope ===");
        Engine appEngine1 = context.getBean("engineApplication", Engine.class);
        Engine appEngine2 = context.getBean("engineApplication", Engine.class);
        System.out.println("Are both application engines same? " + (appEngine1 == appEngine2)); // true
    */
    }
}
