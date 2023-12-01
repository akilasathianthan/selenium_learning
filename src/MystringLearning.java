import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MystringLearning {
	public static void main (String[] args)
	{
		String[] names= {"Akila","Antony","Kevin","Ria"};
		List<String> arraylist=Arrays.asList(names);
		ArrayList<String> ob=new ArrayList<>(Arrays.asList(names));
		
		ob.add("Agnes");
		System.out.println(arraylist.get(0));
		
		for(int i=0;i<ob.size();i++)
		{
			System.out.println(ob.get(i));
		}
	}

}