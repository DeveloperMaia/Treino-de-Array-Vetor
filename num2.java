import java.util.Scanner;
public class num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in);
		
		int [] vetor = new int [10];
		
		System.out.println("Digite 10 números:");
		
		vetor[0]= leitor.nextInt();
		vetor[1]= leitor.nextInt();
		vetor[2]= leitor.nextInt();
		vetor[3]= leitor.nextInt();
		vetor[4]= leitor.nextInt();
		vetor[5]= leitor.nextInt();
		vetor[6]= leitor.nextInt();
		vetor[7]= leitor.nextInt();
		vetor[8]= leitor.nextInt();
		vetor[9]= leitor.nextInt();
		
		System.out.println("A média entre eles é: "+(vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4]+vetor[5]+vetor[6]+vetor[7]+vetor[8]+vetor[9])/10);
		
		
		
		
		
		
	}

}
