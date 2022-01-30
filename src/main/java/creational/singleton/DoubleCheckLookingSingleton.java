package creational.singleton;

public class DoubleCheckLookingSingleton {
    private static volatile DoubleCheckLookingSingleton instance;

    private DoubleCheckLookingSingleton(){}

    public static DoubleCheckLookingSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckLookingSingleton.class){
                if(instance==null){
                    instance = new DoubleCheckLookingSingleton();
                }
            }
        }
        return instance;
    }
}
