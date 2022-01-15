import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class BancoDePalavras {
	
	Vector<String> lista;
	
	public BancoDePalavras() throws FileNotFoundException{
		
		Scanner in = new Scanner(new FileReader("src\\dados.txt"));
		
		this.lista = new Vector<String>();
		
		while (in.hasNextLine()) {
			lista.add(in.nextLine());
		}
		
		in.close();
	}
	
	public String getPalavra() {
		
		Random numRandomico = new Random();
		return this.lista.get(numRandomico.nextInt(this.lista.size()));
		
	}
}
