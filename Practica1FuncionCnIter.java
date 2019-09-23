import java.util.Scanner;

public class Practica1FuncionCnIter {

	public static void main(String[] args) {
		System.out.println("Introduce un numero: ");
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		
		System.out.println(Iter_C(num));
	}

	public static double Iter_C(int n) {
		double[] c = new double[n+1];
		c[0] = 1;
		for(int i = 1;i <= n;i++) {
			double sum = 0.0;
			for(int j = 0; j<i;j++) {
				sum += c[j];
			}
			c[i] = (2.0/i)*sum+i;
		}
		return c[n];
	}
}

