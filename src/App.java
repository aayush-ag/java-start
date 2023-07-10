public class App {
    public static void Hello() throws Exception {
        System.out.println("Hello, World!");
    }
    
    public static void marks() throws Exception {
        int marks = 85;
        if(marks < 50){
            System.out.println("fail");
        }
        else if (marks >= 50 && marks < 60){
            System.out.println("D grade");
        }
        else if (marks >= 60 && marks < 75){
            System.out.println("C grade");
        }
        else if (marks >= 75 && marks < 90){
            System.out.println("B grade");
        }
        else if (marks >= 90 && marks < 100){
            System.out.println("A+ grade");
        }
        else if (marks == 100){
            System.out.println("Full Marks");
        }
        else{
            System.out.println("Invalid");
        }
    }
    
    public static void num_check() throws Exception {
        int number = -13;
        if(number>0){
            System.out.println("POSITIVE");
        }
        else if(number<0){
            System.out.println("NEGATIVE");
        }
        else{
            System.out.println("ZERO");
        }
    }
    
    public static void sum() throws Exception{
        float a = 3.14f;
        float b = 4.1f;
        float c = 0;
        c = a+b;
        System.out.println("c is: " + c);
    }
    
    public static void whileloop() throws Exception {
        int num =0;
        while(num<=5){
            System.out.println(num);
            ++num;
        }
    }
    
    public static void forloop() throws Exception {
        for(int i =0; i< 5; i++){
            System.out.println(i);
        }
    }

    public static void forloop1() throws Exception {
        for(int i =0; i< 5; i+=2){
            System.out.println(i);
        }
    }
    
    public static void forloop2() throws Exception {
        for(int i =0; i< 5; i+=5){
            System.out.println(i);
        }
    }
    
    public static void pattern() throws Exception {
        int n =5;
        for(int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void operator_1() throws Exception {
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
    }

    public static void array_1() throws Exception{
        int[] a = new int[10];

        for(int i=0;i<10;i++){
            a[i]=i;
        }

        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }

    public static void array_2() throws Exception{
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        for(int i=0;i<10;i++){
            a[i]=i;
            b[i]=2*i;
            c[i]=3*i;
        }
        System.out.print("Value of Array A is:");
        for(int i=0;i<10;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("\nValue of Array B is:");
        for(int i=0;i<10;i++){
            System.out.print(b[i] + " ");
        }
        System.out.print("\nValue of Array C is:");
        for(int i=0;i<10;i++){
            System.out.print(c[i] + " ");
        }
    }
    
    public static void array_3() throws Exception{
        int a [][] = new int[3][3];
        int num = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                a[i][j] = num;
                ++num;
            }    
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.print('\n');    
        }        
    }
    
    public static void array_4() throws Exception{
        int a [][] = new int[3][3];
        int num = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                a[i][j] = num;
                ++num;
            }    
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<i;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.print('\n');    
        }        
    }

    public int add(int a, int b){
        return a+b;
    }
    
    /*public static void call_sum() throws Exception{
        int a = 5;
        int b = 10;
        System.out.print(add(a,b));
    }*/
    public static void main(String[] args) throws Exception {
        App obj = new App();
        int x = 10;
        int y = 20;
        int get_result = obj.add(x, y);
        System.out.println(get_result);
    }
}
