package com.example;

public class Main {
    public static void main(String[] args) {
        

        //Declaración de variables con diferentes tipos de datos
        int edad = 17;
        short codigoPostal = 12345;
        double salario = 3500.00;
        String nombre = "Juan Pérez";
        //boolean esMayorDeEdad = true;
        String numeroStr = "12345678";
        String decimalStr = "3.14159";


        //Clases envolventes
        //Autoboxing: convierte la variable edad a un objeto byte
        Byte edad1 = (byte) edad;
        System.out.println("Edad como objeto byte: " + edad1);
        //Unboxing: corvierte la variable edad a su estado original, o sea Byte
        byte edadByte = edad1;
        System.out.println("Edad como valor Byte: " + edadByte);
        //Autoboxing: convierte la variable salario a un objeto Double
        Double salario1 = salario;
        System.out.println("Salario como objeto Double: " + salario1);
        //Variable nombre utlizando el método toString() de la clase String
        String nombre1 = nombre.toString();
        System.out.println("Nombre utlizando el método toString(): " + nombre1);
        System.out.println();


        //Casteo de las variables
        int intsalario = (int) salario;
        System.out.println("Variable 'salario' pasada a entero: " + intsalario);
        long longCodigo = (long) codigoPostal;
        System.out.println("Variable 'codigoPostal' pasada a long: " + longCodigo);
        System.out.println();
        System.out.println("¿Qué sucede con la información al realizar el casteado? R/= Cuando realizamos el casteado la infomación cambiará de su estado de presentación, o sea, si al principio se tenía un tipo de variable con el dato; al aplicar el casteado se cambia el tipo de variable al dato que se desea cambiar.");
        System.out.println();
    
        //Parseo de las variables
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("Variable 'numeroStr' pasada a entero: " + numeroInt );
        double decimalValor= Double.parseDouble(decimalStr);
        System.out.println("Variable 'decimalStr' pasada a double: " + decimalValor);
        System.out.println();

        /*Respuestas a las preguntas
         * ¿Qué diferencias hay entre castear y parsear? R/= El casteo opera  sobre un tipo de dato ya definido (numérico, booleano, entre otros...)ej: convertir un double en un int y esto dentro de una jerarquía de tipo numérico, mientras que el parseo es el que se realiza en los datos de formato de texto (string) convirtiendola en cadena a otro tipo de dato como int, booleano, double...
         * 
         * ¿En qué situaciones sería útil utilizar cada uno de estos procesos? R/= Se podría usar el casteo en donde los datos sean compatibles y se requiera un tipo de variable en específico, ej: no se puede pasar un string a un int. En el parseo sería lo contrario, no requiere que los tipos de datos sean compatibles, ya que el parseo es la interpretación de un string.
         * 
         * ¿Qué aspectos debes tener en cuenta al realizar un casteado? R/= 1) Para evitar una pérdida de información el destino del nuevo dato debe ser más grande que el tipo de dato actual. Ej: casteando un long a int, puede resultar un valor erróneo, debido al límite de almacenamiento del int. 2) La compatibilidad de los datos a la hora de pasarlos. Ej: pasar un dato de tipo int a double, ya que la probabilidad de pérdida de información es mínima.
         */


    }
}