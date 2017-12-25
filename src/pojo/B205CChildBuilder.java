package pojo;

public class B205CChildBuilder implements A20BuilderSet, B205BuilderSet, B205CBuilderSet {

	private B205CBuilder parent;

	public B205CChildBuilder(B205CBuilder parent) {
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

	public B205Builder B205A(String arg) {
		return parent.B205A(arg);
	}

	public B205BBuilder B205B() {
		return parent.B205B();
	}

	public B205CBuilder B205C() {
		return parent.B205C();
	}

	public B205CBuilder B205CA(String arg) {
		return parent.B205CA(arg);
	}

	public B205CBBuilder B205CB() {
		return parent.B205CB();
	}

	public B205CBuilder B205CC(Integer arg) {
		return parent.B205CC(arg);
	}
}
