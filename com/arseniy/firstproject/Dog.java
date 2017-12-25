package com.arseniy.firstproject;

/**
 * My lovely dog
 */
public class Dog {

    private String name;
    
    public void setName(String name){
        this.name = name;
    }

    public void sayHello() {
        System.out.println("\tHello. I am a dog. My name is " + this.name);                
    }

}