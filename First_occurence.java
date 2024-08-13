package lec20_Rec;

public class First_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {3,2,5,7,5,15,7,5};
		int item = 5;
		System.out.println(FirstIndex(arr,0,item));
		

	}
	public static int FirstIndex(int[]arr,int i,int item) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]== item) {
			return i;
		}
	    return FirstIndex(arr,i+1,item);
	}

}
