</*Exercice 1: 
Write Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.*/

public class Person {
  private String name;
  private int age;
  //constructure 
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  //Methode to print:
  public void printDetails(){
  System.out.println(name + " is " + age + " years old.");
  }
  //Geters and setters in the way :-)
  //Geters first! As ladies geters love to get! and ladies fist!
  public String getName (){
    return name;
  }
  
  public int getAge(){
    return age;
  }
  //seters now!
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  
  public static void main (String[] args) {
  //lets create the instans (A fanciy way to sys objects)
  Person person1 = new Person("geohot", 36);
  Person person2 = new Person("leCun", 66);
  :
  person1.printDetails();
  person2.printDetails();
 }
}

