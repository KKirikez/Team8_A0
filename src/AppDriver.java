import java.io.IOException;

public class AppDriver {
	public static void main(String[] args) throws IOException{
		Classes c = new Classes();
		System.out.println(c.readFile());
	}
}
