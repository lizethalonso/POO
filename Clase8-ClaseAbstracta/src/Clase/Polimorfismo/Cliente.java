package Clase.Polimorfismo;

public class Cliente {
    public static void main(String[] args) {
    Animal animal; //primero clase(el molde) y desp el nombre del objeto
    animal= new Perro(); //se comporta como perro
    animal.hacerSonido();

        System.out.println("***********************************");
    animal= new Gato(); //que se comporte como un gato
    animal.hacerSonido();


        System.out.println("*************CASTEO**********************");
        //el casteo es la conversion de un tipo de dato a otro.
        System.out.println("****************CASTEO IMPLICITO*******************");
        Perro perro= new Perro();
        Animal animal1= perro; // un perro es un animal
        animal1.hacerSonido();

        System.out.println("****************CASTEO EXPLICITO*******************");
        Animal animal2= new Gato();
        Gato gato= (Gato)animal2;
        gato.hacerSonido();


        System.out.println("******************INSTANCE OF*****************");
        Animal animal3= new Perro();
        if(animal3 instanceof Perro){ //una simple pregunta
            Perro miPerro= (Perro) animal3;
        }
        System.out.println("****************Double a Integer*******************");
        double numeroDouble= 10.5;
        int numeroEntero= (int)numeroDouble;
        System.out.println(numeroEntero);

        System.out.println("**************Double a String*********************");
        double num2= 7.8d;
        System.out.println(num2);
        String numero= Double.toString(num2);
        System.out.println(numero);
        System.out.println("numero es de tipo " +  ((Object)numero).getClass().getSimpleName());


        System.out.println("**************String a Integer*********************");
        String num= "123";
        int entero=Integer.parseInt(num);
        System.out.println(entero);



    }
}
