public class Cacciatore {
    private String nome;

    public Cacciatore(String nome) {
        this.nome = nome;
    }

    public void colpisciDrago(Thread drago) {
        System.out.println(">>> Il cacciatore " + this.nome + " attacca e colpisce il drago!");
        drago.interrupt();
    }
}