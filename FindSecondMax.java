
public class FindSecondMax {

	public static void main(String[] args) {
	
		int[] num = {3,4,6,100,34,23,56,77};
		
		int max=0,secMax=0;
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i] > max) {
				secMax = max;
				max = num[i];
				
			}
			else if(num[i] > secMax) {
				secMax = num[i];
			}//else
		}//for
		System.out.println("Second Max--->"+secMax);
	}

}
