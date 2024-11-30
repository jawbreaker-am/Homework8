
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("\nЗадача 1:");
        int [ ] a = new int []{1, 2, 3};
        System.out.println(Arrays.toString(a));
        double [ ] b = new double [3];
        b[0] = 1.57;
        b[1] = 7.654;
        b[2] = 9.986;
        System.out.println(Arrays.toString(b));
        boolean [ ] c = new boolean [2];
        c[0]=true;
        c[1]=b[1]>b[2];
        System.out.println(Arrays.toString(c));

        //Задача 2
        System.out.println("\nЗадача 2:");
        int i=0;
        while (i<a.length-1){
            System.out.print(a[i++]+", ");
        }
        System.out.println(a[i]);
        i=0;
        while (i<b.length-1){
            System.out.print(b[i++]+", ");
        }
        System.out.println(b[i]);
        i=0;
        while (i<c.length-1){
            System.out.print(c[i++]+", ");
        }
        System.out.println(c[i]);

        //Задача 3
        System.out.println("\nЗадача 3:");
        i=a.length-1;
        while (i>0){
            System.out.print(a[i--]+", ");
        }
        System.out.println(a[i]);
        i=b.length-1;
        while (i>0){
            System.out.print(b[i--]+", ");
        }
        System.out.println(b[i]);
        i=c.length-1;
        while (i>0){
            System.out.print(c[i--]+", ");
        }
        System.out.println(c[i]);

        //Задача 4
        System.out.println("\nЗадача 4:");
        for (i=0;i<a.length;i++){
            if (a[i]%2!=0){
                a[i]=a[i]+1;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}