
public class SumOfIndivDigits {

	public static void main(String[] args) {
	
		long num = 1133045088922l;
		int r;
		// 0---
		//1--
		//2--
		
		int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c0=0;
		
		while(num != 0) {
			r = (int)(num % 10);
			num = num /10;
			
			if(r ==0) c0++;
			else if(r ==1) c1++;
			else if(r ==2) c2++;
			else if(r ==3) c3++;
			else if(r ==4) c4++;
			else if(r ==5) c5++;
			else if(r ==6) c6++;
			else if(r ==7) c7++;
			else if(r ==8) c8++;
			else if(r ==9) c9++;
		}// while

		System.out.println("0---->"+c0);
		System.out.println("1---->"+c1);
		System.out.println("2---->"+c2);
		System.out.println("3---->"+c3);
		System.out.println("4---->"+c4);
		System.out.println("5---->"+c5);
		System.out.println("6---->"+c6);
		System.out.println("7---->"+c7);
		System.out.println("8---->"+c8);
		System.out.println("9---->"+c9);
		
		
	}

}
