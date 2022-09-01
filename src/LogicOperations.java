public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //Operadores asignación
        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es diferente de b? -> " + (a != b));

        //Operadores relacionales
        System.out.println("a es mayor que b? -> " + (a > b));
        System.out.println("a es menor que b? -> " + (a < b));
        System.out.println("a es mayor o igual que b? -> " + (a >= b));
        System.out.println("a es menor o igual que b? -> " + (a <= b));

        if (a==b){
            System.out.println("a es igual a b");
        }else if((a!=b) && (a>b)){
            System.out.println("a es diferente de b, y a es mayor de b");
        } else if (a>b) {
            System.out.println("a es mayor de b");
        } else if (a<b) {
            System.out.println("a es menor de b");
        } else if (a>=b) {
            System.out.println("a es igual o mayor de b");
        } else if (a<=b) {
            System.out.println("a es igual o menor de b");
        }
    }
}
