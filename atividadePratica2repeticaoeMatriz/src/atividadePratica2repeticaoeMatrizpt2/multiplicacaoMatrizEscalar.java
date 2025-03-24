package atividadePratica2repeticaoeMatrizpt2;
import java.util.Scanner;

public class multiplicacaoMatrizEscalar {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String[][] dados = {
	            {"usuario1", "senha1"},
	            {"usuario2", "senha2"},
	            {"usuario3", "senha3"},
	            {"usuario4", "senha4"},
	            {"usuario5", "senha5"},
	            {"usuario6", "senha6"}
	        };

	        System.out.println("Digite o login:");
	        String login = scanner.nextLine();
	        System.out.println("Digite a senha:");
	        String senha = scanner.nextLine();

	        boolean autenticado = false;
	        for (int i = 0; i < 6; i++) {
	            if (dados[i][0].equals(login) && dados[i][1].equals(senha)) {
	                autenticado = true;
	                break;
	            }
	        }

	        if (autenticado) {
	            System.out.println("Login e senha corretos!");
	        } else {
	            System.out.println("Login ou senha incorretos.");
	        }
	    }
	}

