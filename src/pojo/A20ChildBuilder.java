package pojo;

public class A20ChildBuilder implements A20BuilderSet {

	private A20Builder parent;

	public A20ChildBuilder(A20Builder parent) {
		this.parent = parent;
	}

	public A20Builder B201(String arg) {
		return parent.B201(arg);
	}

	public B202Builder B202() {
		return parent.B202();
	}

	public A20Builder B203(String arg) {
		return parent.B203(arg);
		
	}
	public A20Builder B204(Integer arg) {
		return parent.B204(arg);
	}

	public B205Builder B205() {
		return parent.B205();
	}

	public A20Builder B206(String arg) {
		return parent.B206(arg);
	}
}
