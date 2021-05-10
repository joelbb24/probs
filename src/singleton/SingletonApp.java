package singleton;

class Singleton {
    private static Singleton INSTANCE = null;

    public String s;

    private Singleton() {
        s = "The only instance of Singleton";
    }

    public static Singleton getInstance()
    {
        if(INSTANCE == null)
            synchronized (Singleton.class) {

                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        return INSTANCE;
    }
}

public class SingletonApp
{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s2.s);
        s1.s = s1.s.toUpperCase();
        System.out.println(s1.s);
    }
}