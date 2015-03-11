import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		// ODO Auto-generated method stubj
		
		ArrayList <Integer> array= new ArrayList<Integer>();
		
		array.add(2);
		array.add(0);
		array.add(0);
		array.add(0);
		array.add(0);
		array.add(0);
		array.add(0);
		array.add(1);
		
		int obs=5;
		
		int total=0;
		double std=0;
		
		for(Integer i:array)
			total+=i;
		
		total/=array.size();
		
		for(Integer i:array)
		std+=(i-total)*(i-total);
		
		std/=array.size();
		
		std=Math.sqrt(std);
		
		System.out.println((obs-total)/std);
		
	}

}
