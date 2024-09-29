// WAP to convert the given message in the encrypted format

//input:Meet me at the clock tower
//output:M%%t #e AT th% ##o## TOWER

package Stringprogramming;

public class encryptedmessage {

	public static void main(String[] args) {
		
		String s="Meet me at the clock tower";
		String[] words=s.split(" ");
		for (int i = 0; i < words.length; i++) {
			int rem=i%3;
			if (rem==0) {
				words[i]=vowels(words[i]);
			}else if(rem==1){
				words[i]=consonant(words[i]);
			}else if(rem==2) {
				words[i]=words[i].toUpperCase();
			}
			System.out.print(words[i]+" ");
		}
		
		
	}
	
	public static String  consonant(String s) {
		
		char[] ch=s.toCharArray();
		 for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z') {
				if (ch[i]!='a' && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u'&& 
					ch[i]!='A' && ch[i]!='E' && ch[i]!='I' && ch[i]!='O' && ch[i]!='U')
				{
					ch[i]='#';
				}
				
			}
		}
		 return new String(ch);
		}
	
	public static String vowels(String s) {
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'|| 
					ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U') 
			{
				ch[i]='%';
			}
				
		}
		return new String(ch);
		
	}
	
}
 