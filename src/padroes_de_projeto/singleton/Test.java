package padroes_de_projeto.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy2);

        CepApi eager = CepApi.getInstance();
        System.out.println(eager);
        CepApi eager2 = CepApi.getInstance();
        System.out.println(eager2);

        SingletonLazyHolder lazyh = SingletonLazyHolder.getInstance();
        System.out.println(lazyh);
        SingletonLazyHolder lazyh2 = SingletonLazyHolder.getInstance();
        System.out.println(lazyh2);

        // Nota: Se rodar, veremos que ele pega sempre o mesmo endereço de memoria, ou seja, a mesma instancia.
    }
}
