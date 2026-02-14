package padroes_de_projeto.singleton;

// Singleton "Lazy Holder"
public class SingletonLazyHolder {
    private static class InstanceHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
