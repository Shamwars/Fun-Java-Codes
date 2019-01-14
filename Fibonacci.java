public class Fibonacci{
	public static int index = 0;
	public static int stoppingPoint = 10;

	public static void fib(int n1, int n2){
		System.out.println(" "+ n2);
		index++;
		if(index == stoppingPoint) return;
		fib(n2, n1+n2);
	}

	public static void main(String[] args){
		int n1 = 0;
		int n2 = 1;

		fib(0,1);
	}
}