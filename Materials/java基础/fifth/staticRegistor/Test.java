import com.Hello;

public class Test{
    
    static{
        System.loadLibrary("Hello");
    
    }
    
    public static void main(String args[]){
    
        Hello hello = new Hello();
        hello.say();
    }

}
