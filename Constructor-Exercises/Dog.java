public class Dog {
   private String name;
   private String color;
   
   public Dog() {
      name = "unknown";
      color = "unknown";
   }
   public Dog(String name, String color) {
      this.name = name;
      this.color = color;
      
      System.out.println("Dog's name is "+name+" and the dog's color is "+color);
   }
   
   public static void main(String[] a) {
      Dog dog = new Dog("Creo", "Spotted Black and White");
   }  
}