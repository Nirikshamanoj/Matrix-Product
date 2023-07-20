import java.util.Scanner;
public class MatrixProduct
{
    static void findProduct(int[][] A,int p,int n,int m)
    {
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                A[i][j]*=p;
            }
        }
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] A=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                A[i][j]=scanner.nextInt();
            }
        }
        int productNumber=scanner.nextInt();
        findProduct(A,productNumber,n,m);
    }
}
