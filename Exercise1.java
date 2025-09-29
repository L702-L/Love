import java.util.Scanner;
public class Exercise1
{
    public static void main(String[] args)
    {
        System.out.print("Enter the length of mylists:");
        Scanner num = new Scanner(System.in);
        double[] myList1 = new double[num.nextInt()];
        System.out.printf("Enter %d values:",myList1.length);
        for (int i = 0; i < myList1.length; i++)
        {
            double myList1Value = num.nextDouble();
            myList1[i] = myList1Value;
        }
        double[] myList2 = new double[myList1.length];
        for (int j=0;j<myList1.length;j++)
        {
            myList2[j] = myList1[myList1.length-j-1];
        }
        double[] myList3 = new double[myList2.length];
        for (int k=0;k<myList2.length;k++)
        {
            myList3[k] = myList2[k]+myList1[k];
        }
        System.out.print("myList1:  ");
        for (int l=0;l<myList2.length;l++)
        {
            System.out.print(myList1[l]+"   ");
        }
        System.out.println(" ");
        System.out.print("myList2:  ");
        for (int l=0;l<myList2.length;l++)
        {
            System.out.print(myList2[l]+"   ");
        }
        System.out.println(" ");
        System.out.print("myList3:  ");
        for (int l=0;l<myList2.length;l++)
        {
            System.out.print(myList3[l]+"   ");
        }

    }
}
