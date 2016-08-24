# ArrayIndexsame
import java.util.Scanner;

public class ArrayIndx {

	public static void main(String[] args) {
		int a[]=new int[5];
		
 		Scanner sr=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			a[i]=sr.nextInt();
			
			
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==i){
				System.out.println(a[i]);
			}
		}
		
		

	}

}
