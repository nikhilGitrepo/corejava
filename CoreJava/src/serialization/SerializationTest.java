package serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;

public class SerializationTest {
	
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fs = new FileOutputStream("serializableTest");
		ByteArrayOutputStream stream = new ByteArrayOutputStream();

		PojoObject po = new PojoObject("Kirti");

		String name1 = "Nikhil";
		byte[] bytes = null;
		byte[] objtobytes = null;
		
		try {
//			bytes = name1.getBytes();
//			fs.write(bytes);

			ObjectOutputStream oos = new ObjectOutputStream(stream);
			oos.writeObject(po);
			oos.flush();
			fs.write(stream.toByteArray());

			po.setName("Shruti");
			oos.flush();
			fs.write(stream.toByteArray());

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done!");
		
		byte[] readBytes = new byte[97];
		FileInputStream fis = new FileInputStream("serializableTest");
		try {

			ByteArrayInputStream bis = new ByteArrayInputStream(readBytes, 0, fis.read(readBytes));
			ObjectInputStream ois = new ObjectInputStream(bis);
			System.out.println(ois.readObject());
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
