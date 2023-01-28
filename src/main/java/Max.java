public class Max {

    //metodos genericos
    //los metodos genericos declaran una funcionalidad que luego sera
    //implementada sobre tipos concretos
    //este metodo recibira cualquier tipo que implemente a Comparable y aplicara
    //compareTo(T) donde T es el tipo concreto y compareTo es definido por el programador
    public static<T extends Comparable> T max(T num1, T num2, T num3){
         T max = num1;

         num1.compareTo(num2);

         if(num2.compareTo(max)>0){
             max = num2;
         }

         if(num3.compareTo(max)>0){
             max = num3;
         }

         return max;
    }

    public static void main(String[] args) {
        System.out.printf("Maximo de %d, %d y %d es %d\n\n", 3,4,5,max(3,4,5));
        System.out.printf("Maximo de %.1f, %-1f y %.1f es %.1f\n\n", 6.6,8.8,7.7,max(6.6,8.8,7.7));
        System.out.printf("Maximo de %s, %s y %s es %s\n\n", "pera","manzana","naranja",max("pera","manzana","naranja"));
    }
}
