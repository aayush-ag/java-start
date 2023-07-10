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
    public static void main(String[] args) throws Exception {
        forloop();
    }
}
