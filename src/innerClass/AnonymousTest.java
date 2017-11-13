package innerClass;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class AnonymousTest {

	protected class Wrapping{
		private int i;
		public Wrapping(int x){
			i = x;
		}
		public int value(){
			return i;
		}
		public String toString(){
			return String.valueOf(value());
		}
	}
	
	public Wrapping getWrapping(){
		
		return new Wrapping(2){
			public int value(){
				return super.value() * 4;
			}
		};
	}
	
	public static void main(String[] args) {
		
		AnonymousTest test = new AnonymousTest();
		
		System.out.println(new AnonymousTest().new Wrapping(2).value());
		System.out.println(test.getWrapping());
	}
}
