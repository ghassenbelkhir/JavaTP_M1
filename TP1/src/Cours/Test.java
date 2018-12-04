package Cours;

import java.util.ArrayList;
import java.util.List;

public class Test {

	
	static <T> T f (List <? super T> ls) {return null;}
	
	/*static <T> void g (List <? super T> lt , List <? extends T> ls );
	static <T,S> void h (List <T> lt , List <S> ls );*/
	
	
	public static void main(String[] args) {
		
		List <A> laa = new ArrayList < >();
		List <? extends A> lac = new ArrayList <C >();
		List <? extends B> lbc = new ArrayList <C >();
		ArrayList <? super B> lba = new ArrayList <A >();
		A a = f(lba );
		B b = f(lbc );
		
		
	}
	


}

class A{}
class B extends A{}
class C extends B{}