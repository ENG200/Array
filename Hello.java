public class Hello{
	public static void main(String [] args) {
		for (int i=1; i<=7; i++) {
			for(int j = 7; j>=1; j--) {
				if(i==j) {
					int n = i;
					while(n>=1) {
					System.out.print(n);
					n--;
				}
					n=2;
					while (n<=i) {
						System.out.print(n);
						n++;
					}
											
				}
				else
					System.out.print(" ");
				}
			System.out.print("\n");
		}


	for (int i=6; i>=1; i--) {
		for(int j = 7; j>=1; j--) {
			if(i==j) {
				int n = i;
				while(n>=1) {
				System.out.print(n);
				n--;
			}
				n=2;
				while (n<=i) {
					System.out.print(n);
					n++;
				}
										
			}
			else
				System.out.print(" ");
			}
		System.out.print("\n");
	}

	}
}