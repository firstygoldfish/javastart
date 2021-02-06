import java.io.BufferedReader; 
import java.io.FileInputStream; 
import java.io.InputStream; 
import java.io.InputStreamReader;  
import java.io.FileReader;
public class Exceptions {
    public static void main(String[] args) throws Exception {
           String thisLine = null;        
	   try {          
	   	// open input stream test.txt for reading purpose.          
	   	FileReader fr=new FileReader("testout.txt");
		BufferedReader br = new BufferedReader(fr);           
	   	while ((thisLine = br.readLine()) != null) {
	                System.out.println(thisLine);          
	   	}
    	   } catch(Exception e) {          
		System.out.println(e.getMessage());
		//e.printStackTrace();       
    	   }    
    } 
}
