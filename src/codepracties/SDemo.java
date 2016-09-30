package codepracties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SDemo {

	public static void main(String[] args) throws IOException {
		Sdemo2 s = new Sdemo2();
		s.setI(10);
		s.setName("Raja");
		FileOutputStream fileOut = new FileOutputStream(
				"D:/devhome/employee.ser");

		ObjectOutputStream os = new ObjectOutputStream(fileOut);
		os.writeObject(s);
		os.flush();
		os.close();
		fileOut.close();

	}

}
