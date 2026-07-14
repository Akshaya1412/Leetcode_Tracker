// Last updated: 7/14/2026, 2:17:26 PM
class Solution {
    public String reverseStr(String s, int k) {
        char[] str=s.toCharArray();
        for(int i=0;i<s.length()-1;i+=2*k){
            if(i+k-1<=s.length()-1){
                reverseK(i,i+k-1,str);
            }
            else{
                reverseK(i,s.length()-1,str);
            }
        }
        String ans=new String(str);
        return ans;
    }
    public void reverseK(int i,int j,char[] str){
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }
}