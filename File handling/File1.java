import java.io.*;
class File1
{
   public static int countBytes(InputStream in)throws IOException
   { int cnt=0;

	   try
	   {
		 while(in.read() != -1) cnt++;

	   }

	   finally
	   {
		   return cnt;
	   }

   }

   public static void main(String args[])throws IOException
   {
	 InputStream source=System.in;

	 try
	 {
	   source=new FileInputStream(args[0]);
	 }

	 catch(ArrayIndexOutOfBoundsException arex)
	 {
	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 	String fname;
	 	System.out.print("Enter File name : ");
	 	fname = br.readLine();

		File file=new File(fname);
		if(!file.exists()) throw new FileNotFoundException();

	    source=new FileInputStream(fname);
	 }

	 catch(FileNotFoundException fne)
	 {
	   System.out.println("File Not Found!");
	 }

	 finally
	 {
	   System.out.println("Total bytes = "+countBytes(source));
	 }
   }
}