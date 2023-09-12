package Sample;

public class CaseConversion
{
	public static void main(String[] args)
    {
        String s="TestCase";
        char ch[]=s.toCharArray();
        String res="";
        res=String.valueOf(ch[0]);
        for(int i=1;i<ch.length;i++)
        {

            if(s.charAt(i) >='A' && s.charAt(i) <='Z')
            {
                res=res+'-'+String.valueOf(s.charAt(i));
            }
            else
            {
                res+=String.valueOf(s.charAt(i));
            }
        }
        System.out.println(res.toLowerCase());
    }
}
