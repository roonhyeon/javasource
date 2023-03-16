package ch3;


import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		//점수를 입력받아서 점수가 90점 이상이면 A인데, 그 중에서도 98점 이상이라면 A+, 94점 미만이라면 A-
		//점수가 80점 이상이면 B인데, 88점 이상이라면 B+, 84미만이라면 B-
		//점수가 80점 미만이면 C
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력해주세요: ");
		int score=Integer.parseInt(sc.nextLine());
		char grade=' ', opt='0';

	    if (score>=90) {
			grade='A';
			if (score>=98) {
				opt='+';
			}else if(score<94){
				opt='-';
			}
		}else if(score>=80) {
			grade='B';
			if (score>=88) {
				opt='+';
			}else if(score<84){
				opt='-';
			}
		}else {
			grade='C';
		}
	    System.out.printf("당신의 학점은 %c%c", grade, opt);
	}
}
