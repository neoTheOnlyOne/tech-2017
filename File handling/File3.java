import java.io.*;
class File3
{
   public static void dirOperations()throws IOException
   {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 System.out.print("Enter path : ");
	 String path=br.readLine();

     File dir=new File(path);

     if(!dir.isDirectory()) System.out.println("Invalid Path or directory name");
     else
     {  dir.list();

	 	System.out.print("Which file to delete? : ");
	 	String fname = br.readLine();

	 	File file=new File(fname);

	 	if(file.exists())
	 	{ file.delete();
	 	  System.out.println(file.getName()+" deleted");
 	 	}
 	 	else System.out.println("Such File doesnot exist!");
/*
 	 	try
 	 	{
			file=new File("abc.dat");
			if(file.exists())	file.renameTo("xyz.dat");
		}
		catch(FileNotFoundException fne)
		{
		   System.out.println("File Not Found!");
		}
*/ 	 }

 	 System.out.print("Create dir name : ");
	 String dirname=br.readLine();

	 dir=new File(dirname);

	 if(dir.exists() && dir.isDirectory())
	    System.out.println("Such file/dir name allready exists");
	 else
	 {   dir.mkdir();
		 dir.list();
  	 }

   }

   //////////////////////////////////////////////////////

   public static void main(String args[])
   {
	 try
	 {
	  dirOperations();
	 }
	 catch(IOException ioe)
	 { ioe.printStackTrace();
	 }
   }
}