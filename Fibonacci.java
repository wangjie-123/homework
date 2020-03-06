//wangjie
public class Fibonacci{
	public static int of(int i){
		if(i == 1 || i == 2){
			return 1;
		}
		else{
			return of(i-1) + of(i-2);
		}
	}

	public static void main(String[] args){
	
		for(int i=1; i <= 200; i++){
			
			System.out.println(Fibonacci.of(i));
		
		}
	}	
}