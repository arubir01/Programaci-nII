import java.util.Scanner;

public class Practica1FuncionCnIter2 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero: ");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		
		System.out.println(Iter_C(num));
	}

	public static double Iter_C(int n) {
		double sum=1.0;
		if(n<=0)
			return 1;
		for(int i=1; i<n; i++) {
			 sum=((2.0/i)*sum)+ i + sum;
		}
		return ((2.0/n)*sum)+ n;
}
}