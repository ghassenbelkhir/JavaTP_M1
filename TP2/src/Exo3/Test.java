package Exo3;

public class Test {

	public static void main(String[] args) {
		
		O o = new A();
		O o2 = new B();
		O o3 = new C();
		
		o.dispatch(e->"A", e->"B", e->"C");
		o2.dispatch(e->"A", e->"B", e->"C");
		o3.dispatch(e->1, e->2, e->3);
	}
}
