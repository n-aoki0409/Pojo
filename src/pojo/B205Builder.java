package pojo;

public class B205Builder extends A20ChildBuilder implements B205BuilderSet {

	private B205Pojo pojo;
	private B205BBuilder B205B;
	private B205CBuilder B205C;

	public B205Builder(A20Builder parent) {
		super(parent);
		pojo = new B205Pojo();
		B205B = new B205BBuilder(this);
		B205C = new B205CBuilder(this);
	}

	public B205Pojo getPojo() {
		pojo.B205B = B205B.getPojo();
		pojo.B205C = B205C.getPojo();
		return pojo;
	}

	public B205Builder B205A(String arg) {
		pojo.B205A(arg);
		return this;
	}

	public B205BBuilder B205B() {
		return B205B;
	}

	public B205CBuilder B205C() {
		return B205C;
	}
}
