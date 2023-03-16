package collection;

import java.util.Set;
import java.util.TreeSet;

//TreeSet

public class SetEx4 {

	public static void main(String[] args) {
		
		Set<Integer> set=new TreeSet<>(); //정렬을 따로 안해줘도 알아서 해준다.

		for (int i = 0; set.size() < 6; i++) { 
			int num=(int)(Math.random()*45)+1;
			set.add(num); 
		}
		
		System.out.println(set);
		
		TreeSet<Integer> set2=new TreeSet<>();
		int score[]={80,95,50,35,45,65,10,100}; //제일 처음 들어온 80을 루트로 잡는다.
		
		for (int i = 0; i < score.length; i++) {
			set2.add(score[i]);
		}
		System.out.println("50보다 작은 값 "+set2.headSet(50));
		System.out.println("50보다 큰 값 "+set2.tailSet(50));
		
	}

}
