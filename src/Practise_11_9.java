import java.util.Scanner;

public class Practise_11_9 {
    public static void main(String[] args) {
        System.out.print("Enter the array size n: ");
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();
        int[][] data=new int[n][n];
        int[] sumRow=new int[n];
        int[] sumLine=new int[n];
        int randNum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                randNum=(int)(Math.random()*20)%2;
                data[i][j]=randNum;
                sumRow[i]+=data[i][j];
                System.out.print(data[i][j]);
            }
            System.out.println();
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                sumLine[j]+=data[i][j];
            }
        }
        int maxRow=0;
        for(int i=0;i<n;i++){
            if(sumRow[i]>=sumRow[maxRow]){
                maxRow=i;
            }
        }
        int maxLine=0;
        for(int i=0;i<n;i++){
            if(sumLine[i]>=sumLine[maxLine]){
                maxLine=i;
            }
        }
        System.out.println("The largest row index: "+(maxRow+1));
        System.out.println("The largest column index: "+(maxLine+1));
    }
}
