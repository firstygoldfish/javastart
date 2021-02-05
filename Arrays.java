public class Arrays {
   public static void main(String[] args) {

   String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; 
   cars[0] = "Opel"; // Change first index in array 
   System.out.println(cars[0]);

   System.out.println(cars.length+" cars in array.");

   for (int i = 0; i < cars.length; i++) {
      System.out.println(i+" "+cars[i]);
    }

   for (String i : cars) {
      System.out.println(i+" car");
    }
   }
 }
