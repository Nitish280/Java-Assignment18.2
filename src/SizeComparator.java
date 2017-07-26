import java.util.Comparator;
//here we are creating the class size comparator
public class SizeComparator implements Comparator<HDTV> {
	@Override
	//here we are creating a method which is of return type
	public int compare(HDTV o1, HDTV o2) {
		// TODO Auto-generated method stub
		//here we are applying condition for checking the Size
		if (o1.getSize() == o2.getSize()) {
			return 0;
		} else if (o1.getSize() > o2.getSize()) {
			return 1;
		} else {
			return -1;
		}
	}

}
