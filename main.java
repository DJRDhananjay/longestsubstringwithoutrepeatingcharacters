import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String word="Dhananjay";
		int left=0;
		int maxlen=0;
		HashMap<Character,Integer>map=new HashMap();
		for(int right=0;right<word.length();right++){
		    char ch=word.charAt(right);
		    if(map.containsKey(ch)){
		        left=Math.max(left,map.getOrDefault(ch,0)+1);
		    }
		    map.put(ch,right);
		    maxlen=Math.max(maxlen,right-left+1);
		}
		System.out.print(maxlen);
	}}
