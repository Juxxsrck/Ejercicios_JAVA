public class Ifstatement {
    public static void main(String[] args) {
        boolean isBuetoothEnabled = false;
        int fileSended = 3;

        if (isBuetoothEnabled){
            //Send file
            fileSended++;
            System.out.println("Archivo enviado");
        }else {
            fileSended--;
            System.out.println("Por favor encender Bluetooth para iniciar la transferencia");
        }

        System.out.println(isBuetoothEnabled);
        System.out.println(fileSended);
    }
}
