package loopPractice;

public class LoopPractice {
	public static void main(String[] args) {
		LoopPractice loopPractice=new LoopPractice();
		//loopPractice.firstProblem();
		//loopPractice.secondProblem();
		//loopPractice.thirdProblem();
		//loopPractice.fourthProblem();
		loopPractice.fifthProblem();
	}
	public void firstProblem() {
		//Problem 1. Print numbers from 1 to 20.
		/*
		 * no of iterations are knows so i would go for -- for loop
		 */
		for(int i=1;i<=20;i++) {
			System.out.print(i+" ");
		}
	}
	public void secondProblem() {
		//Problem 2. Print only odd numbers between 1 and 30.
		for(int i=1;i<=20;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
			
		}
	}
	public void thirdProblem() {
		int sum=0;
		// Problem 3. Calculate the sum of numbers from 1 to 100.
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	public void fourthProblem() {
		//Problem 4. Print the multiplication table of 7.
		for(int i=1;i<=10;i++) {
			System.out.println(7*i);
		}
	}
	public void fifthProblem() {
		//Problem 5. Count how many numbers between 1 and 50 are divisible by both 3 and 5.
		for(int i=1;i<=50;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println(i);
			}
		}
	}
}
