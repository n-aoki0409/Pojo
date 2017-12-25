package pojo;

public class B205CBBuilder extends B205CChildBuilder implements B205CBuilderSet {

	private B205CBPojo pojo;

	public B205CBBuilder(B205CBuilder parent) {
		super(parent);
		pojo = new B205CBPojo();
	}

	public B205CBPojo getPojo() {
		return pojo;
	}

	public B205CBBuilder B205CBA(String arg) {
		pojo.B205CBA(arg);
		return this;
	}

	public B205CBBuilder B205CBB(String arg) {
		pojo.B205CBB(arg);
		return this;
	}
}
