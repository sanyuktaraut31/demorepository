public class CubeSum {
	
	static int s=0;
	static int cube=0;
	static int sum=0;
	static int n;
	
	
	public static int Cube() {
	for(int i=0; n!=0 ;i++) {
		int num = 0;
		s = num/10;
		cube = s*s*s;
		sum=sum+cube;
		num=num%10;
	}
	return sum;
}
}