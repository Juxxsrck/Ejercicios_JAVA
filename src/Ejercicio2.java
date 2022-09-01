public class Ejercicio2 {
    public static void main(String[] args) {
        char c = 'z'; //Convierto a int
        int i1 = 250; //Convierto a Long y luego de Long a short
        double d1 = 301.067; //Convierto a Long
        int i2 = 100; //Sumo 5000.66 y convierto a float
        int i3 = 737; // Multiplico por 100 y convierto a bytes
        double d2 = 298.638; //Divido entre 25 y lo convierto a long

        //Conversion
        int cI = (int) c; //#1

        //int>> short >> long
        short iS = (short) i1;
        long iL = iS; //#2

        long dL = (long) d1; //#3

        float iF = (float) i2; //#4 //+5000.66;

        byte iB = (byte) i3; //#5 //*100

        long d2L = (long) d2 / 25;

        //out

        System.out.println(cI);
        System.out.println(iS);
        System.out.println(iL);
        System.out.println(iL);
        System.out.println(dL);
        System.out.println(iF + 5000.66);
        System.out.println(iB * 100);
        System.out.println(d2L);
    }
}
