// class AddSub{
//     int n1, n2;
//     AddSub(int x, int y){
//         n1 = x;
//         n2 = y;
//     }
//     void add( ){
//         System.out.println(n1 + n2);
//     }
//     void sub( ){
//         System.out.println(n1 - n2);
//     }
// }
// class MulDiv extends AddSub{
//     MulDiv(int x, int y){
//         super(x, y);
//     }
//     void mul(){
//         System.out.println(n1 * n2);
//     }
//     void div(){
//         System.out.println(n1 / n2);
//     }
// }

// public class ArithmeticOperation {
//     public static void main(String[] args) {
//         MulDiv md = new MulDiv(20, 10);
//         md.add();
//         md.sub();
//         md.mul();
//         md.div();
//     }
// }

class AddSub{
    int n1, n2;
    AddSub(int x, int y){
        n1 = x;
        n2 = y;
    }
    void addition(){
        System.out.println(n1 + n2);
    }
    void subtraction(){
        System.out.println(n1 - n2);
    }
}

class MulDiv extends AddSub{
    MulDiv(int x, int y){
        super(x, y);
    }
    void multiply(){
        System.out.println(n1 * n2);
    }
    void divide(){
        System.out.println(n1/n2);
    }
}

class ArithmeticOperation{
    public static void main(String[] args) {
        MulDiv md = new MulDiv(20, 10);
        md.addition();
        md.subtraction();
        md.multiply();
        md.divide();
    }
}
