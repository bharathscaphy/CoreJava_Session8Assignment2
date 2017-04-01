import java.util.HashSet;
import java.util.Iterator;


public class HashSetIterator {

	public static void main(String[] args) {
		HashSet<Student> hshSetStd = new HashSet<Student>();
		hshSetStd.add(new Student(1, "Nidhi", "Accounts"));
		hshSetStd.add(new Student(2, "Poonam", "Chemistry"));
		System.out.println("Reading all elements from HashSet using Iterator");
		Iterator<Student> stdItr = hshSetStd.iterator();
		while (stdItr.hasNext()) {
			System.out.println(stdItr.next().toString());
		}
		
	}

}
