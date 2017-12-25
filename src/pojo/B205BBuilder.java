package pojo;

public class B205BBuilder extends B205ChildBuilder implements B205BBuilderSet {

	private B205BPojo pojo;

	public B205BBuilder(B205Builder parent) {
		super(parent);
		pojo = new B205BPojo();
	}

	public B205BPojo getPojo() {
		return pojo;
	}

	public B205BBuilder B205BA(String arg) {
		pojo.B205BA(arg);
		return this;
	}

	public B205BBuilder B205BB(String arg) {
		pojo.B205BB(arg);
		return this;
	}
}
