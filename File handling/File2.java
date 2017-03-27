import java.io.*;
class File2
{
   public static void printFileInfo(String fn)throws FileNotFoundException
   {
	 File file=new File(fn);

	 if(!file.exists()) throw new FileNotFoundException();

	 System.out.println("File Name : "+file.getName());
	 System.out.println("Path : "+file.getPath());
	 System.out.println("Absolute Path : "+file.getAbsolutePath());
	 System.out.println("Parent (dir)  : "+file.getParent());

	 System.out.println("is it Directory ?  : "+file.isDirectory());
	 System.out.println("is it File ? : "+file.isFile());

	 System.out.println("Time  : "+file.lastModified()); // encrypted
	 System.out.println("File Size : "+file.length()+"bytes");

   }

   //////////////////////////////////////////////////////

   public static void main(String args[])throws IOException
   {
	 String fname;

	 try
	 {
	   fname=args[0];
	 }

	 catch(ArrayIndexOutOfBoundsException arex)
	 {
	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 	System.out.print("Enter File name : ");
	 	fname = br.readLine();
	 }

	 try
	 { printFileInfo(fname);
	 }

	 catch(FileNotFoundException fne)
	 {
	   System.out.println("File Not Found!");
	 }

   }
}