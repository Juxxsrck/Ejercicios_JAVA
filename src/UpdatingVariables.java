public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //Bono $200
        salary = salary + 200;
        System.out.println(salary);

        // Pension: $50 descuento

        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra c/u $30
        //comida: $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);
        
        //Actualizando cadenas de texto
        String employeeName = "Sanaider pulido";
        employeeName = employeeName + "Barreto ";
        System.out.println(employeeName);

        employeeName = "Justine " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);
    }


}
