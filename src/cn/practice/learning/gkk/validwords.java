package cn.practice.learning.gkk;

public class validwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sl = new Solution();
		System.out.println(sl.countValidWords("what is the   matter!"));
	}

}

class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.split(" ");
        int count=0;
        for(String s:words){
        	System.out.println("*"+s+"*");
        	System.out.println(s.length());
            if(this.isWord(s)){
                count++;
            }
        }
        return count;
    }
    public boolean isWord(String s){
        int len = s.length();
        int flag = 0;
        if(len==0) return false;
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch>='0'&&ch<='9') return false;
            else if((ch=='!'||ch=='.'||ch==',')&&i!=len-1) return false;
            else if(ch=='-'){
                if(flag==1) return false;
                flag=1;
                if(i==0||i==len-1) return false;
                if(!isLetter(s.charAt(i-1))||!isLetter(s.charAt(i+1)))
                return false;           
            }

        }
        return true;
    }
    public boolean isLetter(char ch){
        if(ch>='a'&&ch<='z') return true;
        else return false;
    }
}
