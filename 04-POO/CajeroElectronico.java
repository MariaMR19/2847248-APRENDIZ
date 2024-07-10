public class CajeroElectronico {
    //Atributos
     int capacidad_total;
     int dinero_disponible;
     int cant_10;
     int cant_20;
     int cant_50;
     int cant_100;
     String banco;
     String transacciones[];
     String usuario;
     int clave;
     int pos_log;

    //Metodos-constructor
    public CajeroElectronico( int dato1, int dato3,  int dato4,  int dato5, int dato6, String dato7, String dato8, int dato9){
         capacidad_total = dato1;
         dinero_disponible = (dato3*10000)+(dato4*20000)+(dato5*50000)+(dato6*100000);
         cant_10 = dato3;
         cant_20 = dato4;
         cant_50 = dato5;
         cant_100 = dato6;
         banco = dato7;         
         usuario = dato8;
         clave = dato9;

         transacciones = new String [100];
         pos_log = 0;
    }

    public void imprimirDetalle(){
        System.out.println("|---------------------------------------------|");
        System.out.println("|-               DETALLE CAJERO               |");
        System.out.println("|---------------------------------------------|");
        System.out.println("| capacidad_total: " +capacidad_total);
        System.out.println("| dinero disponible: " +dinero_disponible);
        System.out.println("| cant_10: " +cant_10);
        System.out.println("| cant_20: " +cant_20);
        System.out.println("| cant_50: " +cant_50);
        System.out.println("| cant_100: " +cant_100);
        System.out.println("| banco: " +banco);
        System.out.println("| usuario: " +usuario);
        System.out.println("| clave: " +clave);
        System.out.println("| Transacciones: ");
        for(int i=0; i<transacciones.length; i++){
            if(transacciones[i]!=null){
                System.out.println("|                    ->"+transacciones[i]);
            }
        }
        System.out.println("|---------------------------------------------|\n");
    }

    //abastecer
    public void abastecerCajero(String usuario, int clave, int cant_10, int cant_20, int cant_50, int cant_100 ){
      // validar usuario y clave
      //si, entonces
        //calcular la cantidad total ingresada
        //validar si cumple con la capacidad del cajero
            //si, actualizar valores
            //no, mostrar error
      //no, mostrar error

      if(this.usuario.equals(usuario) && this.clave==clave){
        int total = (cant_10*10000)+(cant_20*20000)+(cant_10*50000)+(cant_100*100000);
        if(total<= this.capacidad_total){
            this.dinero_disponible = total;
            this.cant_10 = cant_10;
            this.cant_20 = cant_20;
            this.cant_50 = cant_50;
            this.cant_100 = cant_100;
            System.out.println("===== OK - PROCESO EXITOSO - =====");
            transacciones[pos_log] = "10-07-2024 03:32:00 - "+"ABASTECER"+" - "+"0000 0000 0000 0000"+" -$"+total+" - "+"OK";
            pos_log++;


        }else{
            System.out.println("===== ERROR - VALOR INGRESADO EXCEDE CAPACIDAD TOTAL- =====");
            transacciones[pos_log] = "10-07-2024 03:32:00 - "+"ABASTECER"+" - "+"0000 0000 0000 0000"+" -$"+total+" - "+"ERROR CAPACIDAD";
            pos_log++;
        }

      }else{
        System.out.println("====== ERROR -USUARIO INVÁLIDO- ======");
        transacciones[pos_log] = "10-07-2024 03:32:00 - "+"ABASTECER"+" - "+"0000 0000 0000 0000"+" -$0 - "+"ERROR ACCESO";
        pos_log++;

      }

    }

    //ver historial cajero
    public void verHistorialCajero(String usuario, int clave){
        if(this.usuario.equals(usuario) && this.clave==clave){
            System.out.println("Historial de transacciones: ");
            for(int i=0; i<transacciones.length; i++){
                if(transacciones[i]!=null){
                    System.out.println("|                    ->"+transacciones[i]);
                }
            }
            transacciones[pos_log] = "10-07-2024 03:32:00 - "+"HISTORIAL"+" - "+"0000 0000 0000 0000"+" -$0"+" -OK";
            pos_log++;

        }else{
            System.out.println("===== ERROR - USUARIO INVÁLIDO- =====");
                transacciones[pos_log] = "10-07-2024 03:32:00 - "+"HISTORIAL"+" - "+"0000 0000 0000 0000"+" -$0"+"ERROR PROCESO";
                pos_log++;
        }
    }
    
}
