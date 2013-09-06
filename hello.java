import java.io.* ;

class hello
{  
        public static void main(String [] args)
        {

	  BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

           System.out.println("Enter your name: ");
		
	try {

	   String name = in.readLine();

	   System.out.println("Hello " + name);	
	     }

	catch (IOException err) {
		System.out.println("Error");
        }
}
}
// Good job
