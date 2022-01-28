package ParaOGit;
import java.util.Scanner;

public class Vet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v[]= {4,21,9,8,12,21,4,4,1,10};
		for(int i=0;i<v.length;i++) {
			for(int j=0;j<v.length;j++) {
				if(i!=j) {
					if(v[i]==v[j]) {
						System.out.print("Valor repetido na posicao "+i);
						System.out.println(" e "+j);
						System.out.println(+v[i]+"\n" );
					}
				}
			}
		}		
	}
}