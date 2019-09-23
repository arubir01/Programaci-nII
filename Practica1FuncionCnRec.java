import java.util.Scanner;

public class Practica1FuncionCnRec {

		public static void main(String[] args) {
			System.out.println("Introduce un numero: ");
			Scanner s= new Scanner(System.in);
			int num=s.nextInt();
			
			System.out.println(Rec_C(num));
		}
		
		public static double Rec_C(int n) {
			double sumatorio=0.0;
			
			if(n<=0) 
				return 1.0;
				else
				{
					for(int i=0;i<n;i++) {
						sumatorio = sumatorio + Rec_C(i);
					}
					return ((2.0/n)*sumatorio + n);
			}
		}
}
