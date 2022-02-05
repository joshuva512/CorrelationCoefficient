import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter size of an array: ");
		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int sigmax = 0;
		int sigmay = 0;
		int sigmax2 = 0;
		int sigmay2 = 0;
		int sigmaxy = 0;
		for(int i = 0; i < n; i++){
			System.out.print("Enter X element " + (i + 1) + " : ");
			x[i] = scan.nextInt();
			System.out.print("Enter Y element " + (i + 1) + " : ");
			y[i] = scan.nextInt();
			sigmax = sigmax + x[i];
			sigmay = sigmay + y[i];
			sigmax2 = sigmax2 + (x[i] * x[i]);
			sigmay2 = sigmay2 + (y[i] * y[i]);
			sigmaxy = sigmaxy + (x[i] * y[i]);
		}
		double r = ((n * sigmaxy) - (sigmax * sigmay)) / Math.sqrt(((n * sigmax2) - (sigmax * sigmax)) * ((n * sigmay2) - (sigmay * sigmay)));
		System.out.println("\n" + r);
	}
}
