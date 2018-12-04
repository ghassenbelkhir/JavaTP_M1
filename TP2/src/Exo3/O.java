package Exo3;

import java.util.function.Function;

public class O {
	
	public <V> void dispatch(Function<O,V>fa,Function<O,V>fb,Function<O,V>fc) {
		
		if(this instanceof A) {
			System.out.println(fa.apply(this));
		}else if (this instanceof B) {
			System.out.println(fb.apply(this));
		}else if(this instanceof C) {
			System.out.println(fc.apply(this));
		}
			
	}

}
