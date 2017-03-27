import java.io.*;
class File5  // Random Access Files
{
   public static void writeData(String fname)throws FileNotFoundException,IOException
   {
	 RandomAccessFile raf=new RandomAccessFile(fname,"rw");

     for(int i=1; i<=5; i++) raf.writeInt(i+10);

	 raf.close();
   }

   public static void search(String fname,int data)throws IOException
   { Integer ino; int no;

	 RandomAccessFile raf=new RandomAccessFile(fname,"rw");
	 try
	 {
		while((no=raf.readInt()) !=data);
	 	System.out.println(data+" Found!");
	 	//	raf.skipBytes(-4);	//	raf.writeInt(55);
	 }
	 catch(EOFException e)
	 {
		 System.out.println(data+" not Found!");
 	 }
	 raf.close();
   }

   public static void show(String fname)throws IOException
   { int no;
	 RandomAccessFile raf=new RandomAccessFile(fname,"r");

	 try
	 {
		while(true) System.out.println(raf.readInt());
 	 }
	 catch(EOFException e)
	 {
 	 }

	 raf.close();
   }

   public static void main(String args[])throws IOException
   {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 try
	 {
		System.out.print("Enter File name : ");
	 	String filename = br.readLine();
	    writeData(filename);

		show(filename);

		System.out.print("Find No. : ");
	 	String numStr = br.readLine();
	    search(filename,Integer.parseInt(numStr));

	    show(filename);
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