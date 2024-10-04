public class CatInterface {
   public static void main(String[] a) {
      Cat cat = new Cat();
      Cat cat2 = new Cat("unknown");
      
      cat.setCatName("Mukui");
      cat.setCatAge(2);
      System.out.println("\nCat name now is "+cat.getCatName()+" and his age is "+cat.getCatAge()+".");
      
      cat2.setCatName("Dashi");
      cat2.setCatAge(1);
      System.out.println("\nCat 2's name now is "+cat2.getCatName()+" ang her age is "+cat2.getCatAge()+".");
   }
}