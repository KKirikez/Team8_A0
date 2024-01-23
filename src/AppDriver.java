import java.io.IOException;
public class AppDriver {
	
	public static void main(String[] args) throws IOException{
		Classes c = new Classes();
		
		String[] data = {"a","s","d"};
		c.writeFile(data);
		
		System.out.println(c.readFile());
	}
}
