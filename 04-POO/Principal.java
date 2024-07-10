public class Principal{
    public static void main(String[] args){

        CajeroElectronico cajero01 = new CajeroElectronico(500000000, 0, 0, 0, 0, "Davivienda", "adso", 12345);
        CajeroElectronico cajero02 = new CajeroElectronico(180000000, 1000, 1000,1000, 1000, "Bancolombia", "Eugenia", 1923);

        cajero01.imprimirDetalle();
        
        cajero01.abastecerCajero("aAAA", 12345, 5000, 5000, 5000, 5000);
        cajero01.abastecerCajero("adso", 12222, 5000, 5000, 5000, 5000);
        cajero01.abastecerCajero("adso", 12345, 5000, 5000, 5000, 5000);
        cajero01.abastecerCajero("adso", 12345, 50, 50, 50, 50);

        cajero01.verHistorialCajero("adso", 12345);
        cajero01.imprimirDetalle();
    }
}