//import some file classes
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {
	public static void main(String[] args) {
		// here we create object of inputstream and outputstream classes
		FileInputStream ins = null;
		FileOutputStream outs = null;
		try {
			// now create source file in D Drive
			File infile = new File("D:\\hello.txt");
			// create output file in D drive and give it another name
			File outfile = new File("D:\\hi.txt");
			ins = new FileInputStream(infile);
			outs = new FileOutputStream(outfile);
			byte[] buffer = new byte[1024];
			int length;
			// here check whether file empty or not, still all contents will be
			// copied to destination file
			while ((length = ins.read(buffer)) > 0) {
				outs.write(buffer, 0, length);
			}
			ins.close();
			outs.close();
			System.out.println("File copied successfully!!");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}