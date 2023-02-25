package Program;

//just read the object in (output eclipse itself)
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		String path1="C:\\Users\\kabir\\Desktop\\pgm\\IO Java\\Serialization\\Cricketer.txt";
		
		// to read the data from th file
		FileInputStream fis=new FileInputStream(path1);    //write the data
		// to increase the read and write operation to the file
		BufferedInputStream bis=new BufferedInputStream(fis);
		// to read the obj as it is BufferedOutputStream
		ObjectInputStream ois=new ObjectInputStream(bis); 
		Object data=ois.readObject();
		//System.out.println(data);
		((Cricketer)(data)).disp();  //class name is casted to call the method
	}

}
