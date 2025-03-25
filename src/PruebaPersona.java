public class PruebaPersona {
    public static void main(String[] args) {

        persona p1 = new persona("Juan David","Rodriguez","1234567989E");

        persona p2 = new persona("Paquito","Corredera","1234567989E");

        if (p1.equals(p2)){
            System.out.println("Ambas personas tienen el mismo DNI");
        }
        else {
            System.out.println("Las 2 personas son distintas");
        }
    }
}
