package atividadePratica2repeticaoeMatrizpt3;
import java.util.Scanner;
public class transposicaodeMatriz {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int linhas, colunas;

	        System.out.println("Digite o número de linhas da matriz:");
	        linhas = scanner.nextInt();
	        System.out.println("Digite o número de colunas da matriz:");
	        colunas = scanner.nextInt();

	        int[][] matriz = new int[linhas][colunas];
	        int[][] transposta = new int[colunas][linhas];

	        System.out.println("Digite os elementos da matriz:");
	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                matriz[i][j] = scanner.nextInt();
	            }
	        }

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                transposta[j][i] = matriz[i][j];
	            }
	        }

	        System.out.println("Matriz transposta:");
	        for (int i = 0; i < colunas; i++) {
	            for (int j = 0; j < linhas; j++) {
	                System.out.print(transposta[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
