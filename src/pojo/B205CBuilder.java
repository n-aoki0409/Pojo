package pojo;

public class B205CBuilder extends B205ChildBuilder implements B205CBuilderSet {

	private B205CPojo pojo;
	private B205CBBuilder B205CB;

	public B205CBuilder(B205Builder parent) {
		super(parent);
		pojo = new B205CPojo();
		B205CB = new B205CBBuilder(this);
	}

	public B205CPojo getPojo() {
		pojo.B205CB = B205CB.getPojo();
		return pojo;
	}

	public B205CBuilder B205CA(String arg) {
		pojo.B205CA(arg);
		return this;
	}

	public B205CBBuilder B205CB() {
		return B205CB;
	}

	public B205CBuilder B205CC(Integer arg) {
		pojo.B205CC(arg);
		return this;
	}
}
