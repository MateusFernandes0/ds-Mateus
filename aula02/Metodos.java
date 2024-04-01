public class Metodos {
    static void meuMetodo(){
        System.out.println("Assim funciona um  Metodo");
    }
// Stactic define que esse Método pertence a classe main e não é objeto
// void significa que o método não vai ter um retorno
    static void meuMetodoComParametros (String nome, int idade) {
        System.out.println(nome + "tem" + idade);
    }

    public static void main(String [] args){
        meuMetodo();
        meuMetodoComParametros(  "Mateus" , 16);
    }
}