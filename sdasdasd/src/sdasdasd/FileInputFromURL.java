package sdasdasd;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.net.*;




public class FileInputFromURL {

	public static void main(String[] args) throws IOException {
		
		InputStream in = null;   // Variable in of InputStream type is created and initialized with null value. 
		OutputStream out = null;   // Variable out of OutputStream type is created and initialized with null value. 
		
		Scanner sc = new Scanner(System.in);    // Scanner object sc is created to take user value.
		
		System.out.println("Enter an URL example: http://www.gmail.com");
		
		String url_user = sc.nextLine();    //  user input for URL adress
		
		try {
			
			URL url = new URL(url_user);   // URL object is created
			in = url.openStream();		   // openStream() method is which returns InputStream type
				
			 
			System.out.println("Enter the name of a file with .text");
			String file_name = sc.nextLine();    // Takes file name from user.
			out = new FileOutputStream(file_name);
			
			copyStream(in, out);
			
			System.out.println("End of program");
			
		}catch(MalformedURLException e){
			System.out.println("The URL was wrong");}
	
		finally {
			
			sc.close();
			in.close();
			out.close();
		}

	} // End of main method
	
	/**
	 * copyStream is a method which reads data from input file and writes it to the output file. 
	 * @param in is InputStream type.
	 * @param out is OutputStream type.
	 * @throws IOException if file cannot be read or write
	 */
	
	private static void copyStream(InputStream in, OutputStream out)throws IOException{
		
		int oneByte = in.read();
		while(oneByte >= 0) { // Negative value indicates end of Stream
			out.write(oneByte);
			oneByte = in.read();
		}
	}

} // End of class FileInputFromURL
