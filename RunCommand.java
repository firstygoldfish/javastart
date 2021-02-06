import java.io.*;
public class RunCommand {
   public static void main(String[] args) throws IOException {
   Runtime rt = Runtime.getRuntime(); 
   String[] commands = {"ls", "-ls"}; 
   Process proc = rt.exec(commands);  
   BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));  
   BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));  
   // Read the output from the command 
   System.out.println("Here is the standard output of the command:\n"); 
   String s = null; 
   while ((s = stdInput.readLine()) != null) {     
	   System.out.println(s); 
   }  
   // Read any errors from the attempted command 
   System.out.println("\nHere is the standard error of the command (if any):\n"); 
   while ((s = stdError.readLine()) != null) {     
	   System.out.println(s); 
   }
   }
 }
