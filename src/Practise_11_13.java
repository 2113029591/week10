import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Practise_11_13 {
    public static void main(String[] args) {
        System.out.print("Enter five integers for listl: ");
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        int i=0;
        while(i<10){
            arrayList.add(input.nextInt());
            i+=1;
        }
        removeDuplicate(arrayList);

    }
    public static void removeDuplicate(ArrayList<Integer> list){
        list=new ArrayList<>(new HashSet<>(list));
        System.out.print("The distinct integers are ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }

}
