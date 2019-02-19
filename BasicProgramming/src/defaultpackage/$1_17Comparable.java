package defaultpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>
{
	int stuId, Marks;
	String name;
	public Stud(int stuId, String name,int marks) {
		super();
		this.stuId = stuId;
		this.Marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [stuId=" + stuId + ", Marks=" + Marks + ", name=" + name + "]";
	}
	public int compareTo(Stud s) {
		return Marks>s.Marks?1:-1;
	}
	
}
public class $1_17Comparable {

	public static void main(String[] args) {
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(53,"Ragu",99));
		studs.add(new Stud(54,"Vennila",100));
		studs.add(new Stud(51,"Anand",95));
		studs.add(new Stud(52,"Renu",97));
		
		Collections.sort(studs);
		Collections.reverse(studs);
		for(Stud s:studs)
		{
		System.out.println(s);
		}
	}

}
