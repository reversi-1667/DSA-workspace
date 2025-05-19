import java.util.Arrays;

public class LetterCount
{
public static void main(String[] args)
{
    String s= "kaushik";
    char[] name =s.toCharArray();
    for(int i=0;i<s.length()-1;i++)
    {
        int count=1;
        for(int j=i+1;j<s.length();j++)
        {
            if(name[i]==name[j])
            {
                count++;
                name[j]='*';
            }
        }
        System.out.println("the character"+ name[i]+ " has appeared "+ count+ " times");
    }
}
}
