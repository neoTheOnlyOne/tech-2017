import java.io.*;
class File4
{
   public static void show(String fname)throws FileNotFoundException, IOException
   {
	 System.out.println("\nShow File : "+fname);

  	 String s1;

     DataInputStream dis = new DataInputStream(
		 					 	new BufferedInputStream(
									new FileInputStream(fname)));

	 while( (s1=dis.readLine()) != null) System.out.println(s1);

	 dis.close();
   }

   public static void display(String fname)throws FileNotFoundException, IOException
   {
	 System.out.println("\nDisplay File : "+fname);

	 String s1;
     BufferedReader inp = new BufferedReader(new FileReader(fname));

	 while( (s1=inp.readLine()) != null) System.out.println(s1);

	 inp.close();
   }

   public static void main(String args[])throws IOException
   {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	 try
	 {
		System.out.print("Enter File name : ");
	 	String filename = br.readLine();

	    show(filename);    // InputStream
		display(filename); // Reader

	 }

	 catch(FileNotFoundException fne)
	 {
	    System.out.println("File Not Found!");
	 }
	 catch(IOException ioe)
	 {
		 System.out.println(ioe);
  	 }

   }
}