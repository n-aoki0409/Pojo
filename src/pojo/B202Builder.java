package pojo;

public class B202Builder extends A20ChildBuilder implements B202BuilderSet {

	private B202Pojo pojo;

	public B202Builder(A20Builder parent) {
		super(parent);
		pojo = new B202Pojo();
	}

	public B202Pojo getPojo() {
		return pojo;
	}

	public B202Builder B202A(String arg) {
		pojo.B202A(arg);
		return this;
	}

	public B202Builder B202B(String arg) {
		pojo.B202B(arg);
		return this;
	}

	public B202Builder B202C(Integer arg) {
		pojo.B202C(arg);
		return this;
	}
}
