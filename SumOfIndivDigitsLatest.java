
public class SumOfIndivDigitsLatest {

	public static void main(String[] args) {
		long num = 1133045088922l;
		int r;
		
		int[] c = {0,0,0,0,0,
					0,0,0,0,0
				  };
		
		while(num != 0) {
			r = (int)(num % 10);
			c[r]++;
			num = num /10;
			
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i+"---->"+c[i]);
		}

	}

}
