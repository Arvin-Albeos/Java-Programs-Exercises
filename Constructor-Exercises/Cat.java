/*
1. Default Constructor:
Write a Java program to create a class called "Cat" with instance variables name and age.
Implement a default constructor that initializes the name to "Unknown" and the age to 0.
Print the values of the variables.
*/

public class Cat {
   private static String name;
   private static int age;
   
   public Cat() {
      String name = "Unknown";
      age = 0;
      
      System.out.println("Current name of Cat is "+name+" and age is "+age+".");
   }
   
   public Cat(String name) {
      this.name = name;
      age = 0;
      
      System.out.println("Current name of Cat 2 is "+name+" and age is "+age+".");
   }
   
   public String getCatName() {
      return this.name;
   }
   
   public int getCatAge() {
      return this.age;
   }
   
   public void setCatName(String name) {
      this.name = name;
   }
   
   public void setCatAge(int age) {
      this.age = age;
   }
}