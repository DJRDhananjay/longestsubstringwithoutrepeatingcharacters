import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String name="Dhananjay";
		int left=0;
		HashMap<Character,Integer>map=new HashMap();
		int maxlength=0;
		for(int right=0;right<name.length();right++){
		    char ch=name.charAt(right);
		    if(map.containsKey(ch)&&map.get(ch)>=left){
		        left=map.get(ch)+1;
		    }
		    map.put(ch,right);
		    int length=right-left+1;
		    if(length>maxlength){
		        maxlength=length;
		    }
		}
		System.out.print(maxlength);
	}
}
