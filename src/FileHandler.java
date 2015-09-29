import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileHandler {

	private final File file;

	public File getFile() {
		return file;
	}

	public FileHandler(String fileName, boolean createNew) {
		file = new File(fileName);
		if (createNew && !file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public FileHandler(String fileName) {
		this(fileName, true);
	}

	public static boolean writeToFile(FileHandler file2, String s) {

		try {
			FileOutputStream fis = new FileOutputStream(file2.getFile());
			fis.write(s.getBytes());
			fis.flush();
			fis.close();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}

	}


	public static void main(String[] args) {
		readFile(args[0]);

	}
	
	private static String log(String msg) {
		String date = new SimpleDateFormat("MMMM dd YYYY").format(new Date());

		return date + " : " + msg + "\r\n";

	}
	
	public static void readFile(String path) {
		String logPath = "C:\\homework\\my.log";

		File file = new File(path);
		try {
			if (!file.exists()) {

				String msg = "File path you entered " + path
						+ " does not exist.";
				FileHandler fhMessage = new FileHandler(logPath);
				FileOutputStream fos = new FileOutputStream(fhMessage.getFile());
				msg = log(msg);
				fos.write(msg.getBytes());
				new FileHandler(path);

				msg = log("Created the file " + path);
				fos.write(msg.getBytes());
				
				fos.close();
			} else {
				String msg = "File " + path + " already exists.";
				msg = log(msg);
				FileHandler fhMessage = new FileHandler(logPath);
				writeToFile(fhMessage, msg);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
