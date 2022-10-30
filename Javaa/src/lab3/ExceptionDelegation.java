package lab3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDelegation {
	int arr[]=new int[] {3,5,7,9,3,4};
	int array2[]=null;
	String str=null;
	
	public void trigger() throws  IllegalAccessException, IOException,IllegalArgumentException {
		write();
		check("dddddd");
	}
	
	 public void write() throws IOException {
		 FileReader fr=new FileReader("abc.txt");    
         int i;    
         while((i=fr.read())!=-1)    
         System.out.print((char)i);    
         fr.close();    
     
		}
	    

	    public Boolean check(String value) throws IllegalAccessException,IllegalArgumentException {
	        if (value.equalsIgnoreCase("")) {
	            throw new IllegalAccessException("InValid Data entered");
	        }
	        
	        if (value.length()>10) {
	            throw new IllegalArgumentException("Invalid Input");
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        try {
	            new ExceptionDelegation().trigger();
	        } catch (FileNotFoundException e) {	    
	            e.printStackTrace();	        
	        } catch (IllegalAccessException e) {	          
	            e.printStackTrace();	         
	        } catch(IllegalArgumentException iarge) {
	            iarge.printStackTrace();
	        } catch (Exception e) {	           
	            e.printStackTrace();
	        } finally {
	            System.out.println("program ended");
	        }

	}

}
