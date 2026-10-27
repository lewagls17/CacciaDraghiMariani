public class Drago implements Runnable {
    String nome;
    int num_battiti;

    public Drago(int num_battiti, String nome) {
        this.nome = nome;
        this.num_battiti = num_battiti;
    }

    @Override
    public void run() {
        for (int i = 0; i < num_battiti; i++) {
            System.out.println(this.nome + " battito ali " + (i + 1));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("CRITICO! " + this.nome + " è stato colpito dal cacciatore ed è morto definitivamente!");
                break;
            }
        }
        System.out.println(this.nome + " ha terminato la sua vita.");
    }
}