public class BreakCont {
   public static void main(String[] args) {
   for (int i = 0; i < 10; i++) {
      if (i == 4) {
	System.out.println("Break at 4.");
        break;
      }
      System.out.println(i); }

   for (int j = 0; j < 10; j++) {
      if (j == 4) {
	System.out.println("Continues here at 4.");
        continue;
	// Never gets here as after continue.
      }
      System.out.println(j);
    }
   }
 }
