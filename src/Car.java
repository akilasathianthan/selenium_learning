import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
List ob=new ArrayList<Model>();

while(true)
{
	Model clasob=new Model();
	System.out.println("Endr model");
	clasob.setModel(input.next());
	System.out.println("Endr price");
	clasob.setPrice(input.nextInt());
	ob.add(clasob);
	System.out.println(ob);
}
	}

}
