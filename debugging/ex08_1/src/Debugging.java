public class Debugging {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciou o programa no metodo principal.");
        a();
    }

    static void a() {
        System.out.println("Iniciando o metodo A.");
        
        b();
        System.out.println("Metodo A finalizado.");
    }

    static void b() {
        System.out.println("Iniciando o metodo B.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Metodo B finalizado.");
    }

    static void c() {
        System.out.println("Iniciando o metodo C.");
        
        Thread.dumpStack();
        
        System.out.println("Metodo C finalizado.");
    }
}
