package Program;

//objects is imp

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String args[]) throws IOException
	{
		String path1="C:\\Users\\kabir\\Desktop\\pgm\\IO Java\\Serialization\\Cricketer.txt";
		
		// to interact the fle
		FileOutputStream fos=new FileOutputStream(path1);    //write the data
		// to increase the read and write operation to the file
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		// to write the obj as it is BufferedOutputStream
		ObjectOutputStream oos=new ObjectOutputStream(bos); 
		//creation of object
		Cricketer c=new Cricketer("Rohit",12000,"Delhi",7);
		c.disp();
		//writing the obj to the file
		oos.writeObject(c);
		//to clear the contents of object output stream
		oos.flush();
		bos.flush();
	}

}
