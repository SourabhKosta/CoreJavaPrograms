import java.util.Scanner;

public class PatterPrint_1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Series to be find "+a);
        for(int i=1;i<a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
