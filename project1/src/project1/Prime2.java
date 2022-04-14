package project1;

public class Prime2 {
	public static boolean isPrime(int number) {
		for(int i=2;i<Math.sqrt(number);i++) { //Math.sqrt는 제곱근을 의미하며, 만약 소수가 아닌 수는 약수는 대칭으로 이루어져 있다는 것을 이용하여 반복횟수를 줄임
			if(number%i==0) {
					return false;
				}
		}
		return true;
	}

	public static void main(String[] args) {
		long startTime, endTime, execTime;
		int N =1000000;
	
		startTime = System.nanoTime();
		for (int i=0; i<N; i++) {
			System.nanoTime();
			isPrime(1237);
			
		}
		
		endTime = System.nanoTime();
		execTime = endTime-startTime;
		
		System.out.println("Execution Time in nanao seconds = " + (double) (execTime/N));


	}
	
}
