package Arrays;

public class ArrayasFunctionArgument {
    public static void update(int mark[], int change) {
        change = 3;
        //change marks arrays values by 1
        for(int i = 0 ; i<mark.length;i++)
            mark[i] += 1;
        
    }
    public static void main(String[] args) {
        int marks[] = {97 , 98 , 99};
        int unchangeable = 5 ; 
        update(marks , unchangeable);
        System.out.println(unchangeable);
        // print array marks after update method 
        for(int i = 0 ; i<marks.length;i++)
            System.out.print(marks[i] + " ");
        System.out.println();
    }   
}
