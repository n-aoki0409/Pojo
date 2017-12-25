package pojo;

public class UsePojo {

	public static void main(String[] args) {
		A20Builder a20Builder = new A20Builder();
		a20Builder
			.B201("B201")
			.B202()
				.B202A("B202A")
				.B202B("B202B")
				.B202C(1)
			.B203("B203")
			.B204(0)
			.B205()
				.B205A("B205A")
				.B205B()
					.B205BA("B205BA")
					.B205BB("B205BB")
				.B205C()
					.B205CA("B205CA")
					.B205CB()
						.B205CBA("B205CBA")
						.B205CBB("B205CBB")
					.B205CC(2)
			.B206("B206")
		;

		A20Pojo a20Pojo = a20Builder.getPojo();
		System.out.println(a20Pojo.B201);
		System.out.println(a20Pojo.B202.B202A);
		System.out.println(a20Pojo.B202.B202B);
		System.out.println(a20Pojo.B202.B202C);
		System.out.println(a20Pojo.B203);
		System.out.println(a20Pojo.B204);
		System.out.println(a20Pojo.B205.B205A);
		System.out.println(a20Pojo.B205.B205B.B205BA);
		System.out.println(a20Pojo.B205.B205B.B205BB);
		System.out.println(a20Pojo.B205.B205C.B205CA);
		System.out.println(a20Pojo.B205.B205C.B205CB.B205CBA);
		System.out.println(a20Pojo.B205.B205C.B205CB.B205CBB);
		System.out.println(a20Pojo.B205.B205C.B205CC);
		System.out.println(a20Pojo.B206);
	}
}