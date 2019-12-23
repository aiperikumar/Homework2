package com.company;

public class Main {

    public static void main(String[] args) {
	String name;
	int age = 17;
	int temperature = 7;
	
	if (age >=25 && age<= 45 && temperature< 30 && temperature> -20 ){
        System.out.println("Можно идти гулять!");
    }
	if (age<= 20 && temperature< 30 && temperature> -20 ){
        System.out.println("Можно гулять!");
    }
        if (age <= 45 && temperature < 25 && temperature > -10) {
            System.out.println("Можно идти гулять!");
        }

    }
}
