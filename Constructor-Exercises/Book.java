public class Book {
   private String title;
   private String author;
   private double price;
   
   public Book() {
      title = "unknown";
      author = "unknown";
      price = 0.00;   
   }
   
   public Book(String title, String author) {
      this.title = title;
      this.author = author;
      price = 0.00;
      
   }
   
   public Book(String title, String author, double price) {
      this.title = title;
      this.author = author;
      this.price = price;
      }  
   
   public static void main(String[] a) {
      Book book1 = new Book();
      System.out.println("\nBook 1 details are as follows: \nBook Title: "+book1.title+"\nBook Author: "+book1.author+"\nBook Price: P"+book1.price);
      
      Book book2 = new Book("Geodetic Engineering Fundamentals","Arvin S. Albeos, Geodetic Engr.");
      System.out.println("\nBook 2 details are as follows: \nBook Title: "+book2.title+"\nBook Author: "+book2.author+"\nBook Price: P"+book2.price);
      
      Book book3 = new Book("Geodetic Engineering Advanced (for Field Workers)","Arvin S. Albeos, CE, Certified Public Surveyor", 2759.99);
      System.out.println("\nBook 3 details are as follows: \nBook Title: "+book3.title+"\nBook Author: "+book3.author+"\nBook Price: P"+book3.price);
   }
}