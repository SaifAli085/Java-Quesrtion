// class B{
//      void addition(){
//         System.out.println(10+10);
//     }
//     void addition(int x, int y){
//         System.out.println(x+y);
//     }
//     void floatSum(float x, float y){
//         System.out.println(x + y);
//     }
    
// }
// public class MethodOverloading {
   
//     public static void main(String[] args) {
//         B b = new B();
//         b.addition();
//         b.addition(10, 20);
//         b.floatSum(2.5f, 2.5f);
//     }
// }

class Test {
    void addition(){
        System.out.println(10 + 10); 
    }
    void addition(int x, int y){
        System.out.println(x + y); 
    }
    void addition(float x, float y){
        System.out.println(x + y); 
    }
}

class MethodOverloading{
    public static void main(String[] args) {
        Test t = new Test();
        t.addition();
        t.addition(5, 5);
        t.addition(2.5f, 2.5f);
    }
}