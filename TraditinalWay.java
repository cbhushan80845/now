package java8;

interface newhello {
 abstract  int  syahello (int a ,int b);
 default int substractMe(int c,int d) {
	return c-d;
	 
 }
 
}	
public class TraditinalWay {
	public static void main(String[] args) {
		
		newhello newhello = (a,b) -> {
			 return (a+b);
		};
		
		System.out.println(newhello.syahello(8,9));
		System.out.println(newhello.substractMe(11, 10));
	}

}
