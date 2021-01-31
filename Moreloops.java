
public class Moreloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int i = 100;
	//	while (i >= 0) {
		//	System.out.println(i);
		//	i = i - 3;
			//for ( int i = 0; i <= 100; i++) {
				//System.out.println(i);
		for (int i = 0; i <= 100; i++)
			if ((i % 3 == 0) && (i % 5 == 0) && (i > 0)) {
				System.out.println("Hello World"); 
			}
			else if (i % 5 == 0 && (i > 0) ) {
				System.out.println("World");
			}
			else if (i % 3 ==0 && (i > 0)) {
				System.out.println("Hello");
			}						
			else {
				System.out.println(i);
		}
	}
}
