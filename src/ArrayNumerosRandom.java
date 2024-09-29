import java.util.Random;

public class ArrayNumerosRandom {
    // ATRIBUTO ARRAY DE ENTEROS
    private int [] array;

    // CONSTRUCTOR DONDE RECIBE X PARAMETROS EL TAMAÑO DEL ARRAY
    // LLAMA AL METODO "LLLENAR ARRAY" --> SE LE PASA EL ARRAY X PARAMETRO PARA SER LLENADO X NUMEROS RANDOM
    public ArrayNumerosRandom(int tamanio) {
       
        array=new int [tamanio];
       
        llenarArray(array);
    }

    //LLENA EL ARRAY CON NUMEROS RAMDOM
    public void llenarArray(int [] array){
        
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(7000)+1;
            
        }

    }
    
    // GETTERS Y SETTERS
    
    public int[] getArray() {
        return array;
    }

    public void calcularMayorYMenor() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                posicionMayor = i;
            }
            if (array[i] < min) {
                min = array[i];
                posicionMenor = i;
            }
        }

        System.out.println("El mayor número es: " + max + " en la posición: " + posicionMayor);
        System.out.println("El menor número es: " + min + " en la posición: " + posicionMenor);
    }
    
    //POSICIONES DEL ELEMENTO MENOR Y MAYOR

    public int getPosicionMayor() {
        int max = Integer.MIN_VALUE;
        int posicionMayor = 0;
    
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                posicionMayor = i;
            }
        }
    
        return posicionMayor;
    }
    
    public int getPosicionMenor() {
        int min = Integer.MAX_VALUE;
        int posicionMenor = 0;
    
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                posicionMenor = i;
            }
        }
    
        return posicionMenor;
    }
    
    
  }



