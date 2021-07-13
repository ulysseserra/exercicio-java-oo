import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteReader {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        String linha = br.readLine();
        
        while(linha != null) {
        	System.out.println(linha);
        	linha = br.readLine();
        }

        System.out.println(linha);
   
        br.close();

	    }

}
