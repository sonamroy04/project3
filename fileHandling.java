package project3;
import java.io.*;


public class fileHandling {

	public static void main(String[] args) {
		//create file
		File f = new File("c:\\users\\sonam\\desktop\\fileHandlingProject3.txt");
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File Successfully Created...!!!");
			}
		
			else 
			{
				System.out.println("File Already Exists....!!!");
			}
		}
		catch(IOException i)
		{
			System.out.println("Exception handled...!");
		}
		//Class fileInfo
		
		if(f.exists())
		{
			System.out.println("File Name: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("File Writeable: "+f.canWrite());
			System.out.println("File Readable: "+f.canRead());
			System.out.println("File Size: "+f.length());
		}
		//CLASS fileWriter
		try
		{
		  FileWriter g = new FileWriter("c:\\users\\sonam\\desktop\\fileHandlingProject3.txt");
		
            try
    	       {
    		     g.write("Java programming is the best language"); 
    	       }
     finally
           {
    	     g.close();
           }
                System.out.println("SUCCESSFULLY DATA WROTE IN FILE");
           }
     catch(IOException i)
        {
	         System.out.println(i);
        }
		
		
		//class FileReader 
		
      
	  try 
       {
	    FileReader r = new FileReader("c:\\\\users\\\\sonam\\\\desktop\\\\fileHandlingProject3.txt");
       try
         {
	     int i;
	     while((i=r.read())!=-1)
	        {
		      System.out.print((char)i);//typeCasting
	        }
          }
      finally
            {
	          r.close();
             }
           }
      catch(IOException e)
            {
	            System.out.println("Exception Handled..!!");
             }
            }
         }
        
         
    
		
		
	

	


