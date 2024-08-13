package lec20_Rec;

public class PrintSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abcd";
		String ans = "";
		PrintSubsequence(ques,ans);

	}
	public static void PrintSubsequence(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		char ch = ques.charAt(0);
		PrintSubsequence(ques.substring(1) , ans);
		PrintSubsequence(ques.substring(1),ans+ch);
	}

}
