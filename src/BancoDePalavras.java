import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class BancoDePalavras {
	
	private Vector<String> lista;
	
	public BancoDePalavras() throws FileNotFoundException{
		
		Scanner sc = new Scanner(new FileReader("src\\dados.txt"));
		
		this.lista = new Vector<String>();
		
		while (sc.hasNextLine()) {
			lista.add(sc.nextLine());
		}
		
		sc.close();
	}
	
	public String getPalavra() {
		return this.lista.get(new Random().nextInt(this.lista.size()));
	}
}
