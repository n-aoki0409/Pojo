package pojo;

public class A20Builder implements A20BuilderSet {

	private A20Pojo pojo;
	private B202Builder B202;
	private B205Builder B205;

	public A20Builder() {
		pojo = new A20Pojo();
		B202 = new B202Builder(this);
		B205 = new B205Builder(this);
	}

	public A20Pojo getPojo() {
		pojo.B202 = B202.getPojo();
		pojo.B205 = B205.getPojo();
		return pojo;
	}

	public A20Builder B201(String arg) {
		pojo.B201(arg);
		return this;
	}

	public B202Builder B202() {
		return B202;
	}

	public A20Builder B203(String arg) {
		pojo.B203(arg);
		return this;
	}

	public A20Builder B204(Integer arg) {
		pojo.B204(arg);
		return this;
	}

	public B205Builder B205() {
		return B205;
	}

	public A20Builder B206(String arg) {
		pojo.B206(arg);
		return this;
	}
}
