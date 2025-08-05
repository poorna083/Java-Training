//adding 3 number with functions
import java.util.*;;
public class Demo5 
{
    public class main
    {
        int add(int a,int b,int c)
        {
            return a+b+c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = add(a,b,c);
        System.out.println(result);

        sc.close();

    }
}
