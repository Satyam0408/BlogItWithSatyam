package java_8_Lambda;

public class ConstructorAsLambda {
    public static void main(String[] args) {
        // Using Lambda Expression
        Factory factory1 = String -> new String(String);
        
        // Using double colon(::) operator
        Factory factory = String::new;
        
        factory.method("Hello");
    }

}

interface Factory {
    public String method(String original);
}
