import java.net.PortUnreachableException;

/** Class that determines whether or not a year is a leap year.
 *  @author YOUR NAME HERE
 */
public class LeapYear {

    /** Calls isLeapYear to print correct statement.
     *  @param  year to be analyzed
     */
    public static boolean isLeapYear(int year){
return ((year%4==0&&year%100!=0)||year%400==0);
}
    private static void checkLeapYear(int year) {
        if (isLeapYear(year)) {
            System.out.printf("%d is a leap year.\n", year);
        } else {
            System.out.printf("%d is not a leap year.\n", year);
        }
    }

    /** Must be provided an integer as a command line argument ARGS. */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter command line arguments.");
            System.out.println("e.g. java Year 2000");
        }
        for (int i = 0; i < args.length; i++) {
            try {
                int year = Integer.parseInt(args[i]);
                checkLeapYear(year);
            } catch (NumberFormatException e) {
                System.out.printf("%s is not a valid number.\n", args[i]);
            }
        }
    }
}

/*********************** */
public class world{
    /**
     * @param args
     */
    public static void main(String[] args){
        System.out.println("hello world");
        int x;
        x=0;
        while(x<10){
            System.out.println(x);
            x+=1;
        }
    }
}
public class large{
    public static larger(int x,int y){
        if(x>y){
            return x;
        }
        return y;
    }
    public static void main(String[] args){
       
    }
}

public class prtstar{
    public static void main(String[] args){
        int line =1;
        int i=0;
        while(line<=5){
            i=0;
            while(i<line){
                System.out.print('*');
                i++;
            }
            System.out.println();
            line++;
        }
    }
}

public class ClassNameHere {
    public static void drawTriangle(int n){
        int line =1;
        int i=0;
        while(line<=n){
            i=0;
            while(i<line){
                System.out.print('*');
                i++;
            }
            System.out.println();
            line++;
        }
    }
    public static void main(String[] args) {
      drawTriangle(10);
    }
 }

public class ClassNameHere {
    public static int max(int[] m) {
        int max=0;
        for(int i=1;i<m.length;i++){
            if(m[max]<m[i]){
                max=i;
            }
        }
        return m[max];
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
       System.out.println(max(numbers));     
    }
}

public class BC{
    public static void windowPosSum(int [] a,int n){
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                for(int j=1;j<=n;j++){
                    a[i]+=a[i+j];
                }
            }
        }
    }
    public static void main(String[] args){
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        for(String s:a)

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}

public static int fib(int n){
    int f0=0,f1=1,t;
    if(n==0)return 0;
    else if(n==1)return 1;
    else{
        for(int i=1;i<n;i++){
            t=f0;
            f0=f1;
            f1+=t;
        }
        return f1;
    }
}

public get(Intlist L,int n){
    if(n==0){
        return L.first;
    }
    else if(L.rest!=NULL){
        return get(L.rest,n-1);
    }
}
