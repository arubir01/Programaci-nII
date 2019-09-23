import java.util.Scanner;

public class Practica1FuncionCnIter3 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero: ");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		
		System.out.println(sumat(num));
		System.out.println(rec_lineal(num));
	}

	public static double sumat(int n) {
		if(n<1)
			return 1.0;
		else
		{
			double sum=sumat(n -1);
			return ((2.0/n)*sum) + n + sum;
		}
	}
	public static double rec_lineal(int n) {
		if(n<1)
		{
			return 1.0;
		}
		return (2.0/n)*sumat(n -1);
	}
}

