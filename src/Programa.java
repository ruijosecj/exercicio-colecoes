import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		List<Pessoa> masculino = new ArrayList<>();
		List<Pessoa> feminino = new ArrayList<>();
		
		String resposta = "sim";
		
		Scanner ler = new Scanner(System.in);
		
		Pessoa p = new Pessoa();
		
		while(resposta.equals("sim")) {
			System.out.println("Digite o nome:");
			String nome = ler.next();
			
			System.out.println("Digite o sexo:");
			String sexo = ler.next();
			
			p.setNome(nome);
			p.setSexo(sexo);
			
			if (p.getSexo().equals("masculino")) {
				masculino.add(p);
			}else {
				feminino.add(p);
			}
			p = new Pessoa();
			
			System.out.println("Deseja adicionar uma pessoa:");
			resposta = ler.next();
			
		}
		
		System.out.println("Lista masculino: " +masculino);
		System.out.println("Lista feminino: " +feminino);

	}

}
