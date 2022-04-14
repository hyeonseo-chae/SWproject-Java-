package project1;

public class ExecTime {

	public static void main(String[] args) {
		long startTime, endTime, execTime;
		int N =1000000;
		
		startTime = System.nanoTime();
		
		for (int i=0; i<N; i++) {
			System.nanoTime();
		
		}
		endTime = System.nanoTime();
		
		execTime = endTime-startTime;
		
		System.out.println("Execution Time in nanao seconds = " + (double) (execTime/N));

	}

}
