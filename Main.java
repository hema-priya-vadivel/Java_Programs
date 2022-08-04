public class Main
{
	public static void main(String[] args) {
	        int a = (int)Math.random();
	        int b = Math.min(++a,a++);;
	        System.out.println(b);
	}
}
