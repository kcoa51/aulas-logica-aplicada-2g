public class Pessoa extends Animal {
    // Atributo da classe

    String sobrenome;

    // métodos da classe
    public void falar() {
        System.out.println("falei"); }

   // Sobrecarga do método
    public void falar(String volume) {
        System.out.println("falei" + volume);
    }
    public String falar(String volume,String tom) {
        return "falei" + volume;
    }

}


