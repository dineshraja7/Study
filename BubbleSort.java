import java.util.Scanner;
class BubbleSort{
	public static void main(String[] args){
		int a,b,c,fake;
		Scanner din = new Scanner(System.in);
		a = din.nextInt();
		int array [] = new int[a];
		System.out.println("Please enter the list of " +  a  + " numbers to be sorted");
		for(b=0;b<a;b++){
			array[b] = din.nextInt();
		}
		for(b=0;b<(a-1);b++){
			for(c = 0;c<a-b-1;c++){
				if(array[c]>array[c+1]){
					fake = array[c];
					array[c] = array[c+1];
					array[c+1] = fake;
					for(b = 0;b<a;b++){
			            System.out.println("Your bubble sorted array is:"+array[b]);
		            }
				}
			}
		}
		
	}
}