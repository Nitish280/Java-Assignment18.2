import java.util.ArrayList;
import java.util.Collections;

//here we are creating a class hdtvdemo
public class HDTVDemo {
	// here we are creating the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here we are creating the object of hdtv
		HDTV hdtv1 = new HDTV("Panasonic", 60);
		HDTV hdtv2 = new HDTV("Sony", 24);
		HDTV hdtv3 = new HDTV("LG", 32);
		// here we are creating the arraylist for hdtv
		ArrayList<HDTV> arrayList = new ArrayList<>();
		// here we are adding the object in the array list
		arrayList.add(hdtv1);
		arrayList.add(hdtv2);
		arrayList.add(hdtv3);
		// here we are sorting the array list on the basis of size
		// we are using the size comparator which compare the Size
		Collections.sort(arrayList, new SizeComparator());
		// here we are using for loop to intialize the arraylist
		for (HDTV el : arrayList) {
			System.out.println(el.getBrandName() + " :: " + el.getSize());
		}
	}

}
