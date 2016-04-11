import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sub {

	private String rawContent;

	public Sub(File file) {
		this.rawContent = readFile(file);
	}

	public List<String> entries() {
		return Arrays.asList(rawContent.split("\n\n"));
	}

	private static String readFile(File file) {
		Scanner readF = null;
		String temp = "";
		try {
			readF = new Scanner(file);
			while (readF.hasNextLine()) {
				temp += readF.nextLine() + "\n";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return temp;

	}

}