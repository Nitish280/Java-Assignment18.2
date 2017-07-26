
/*
 * here we are creating an application for HDTV objects
 *  in sorted order of size by using Comparator
 */
//here we are creating a class hdtv
public class HDTV {
	// here we are taking the property of hdtv
	private String brandName;
	private int size;

	// here we are creating the constructor

	public HDTV(String brandName, int size) {
		this.brandName = brandName;
		this.size = size;
	}

	// here we are using the getter and setter for all the properties
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
