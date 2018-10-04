package java_8_Interface;

@FunctionalInterface
interface InterfaceHavingStaticMethod {

    static int getHashCode(String input) {
        return input.hashCode();
    }

    default int getUniqueKey(int id, String name) {
        return id * getHashCode(name);
    }

    void abstractMethod(String s);
}

public class InterfaceHavingStaticImpl/* implements InterfaceHavingStaticMethod */{

    /*@Override
    public void abstractMethod(String s) {
        System.out.println("abstract method impl");
    }*/

    public static void main(String[] args) {
        System.out.println(InterfaceHavingStaticMethod.getHashCode("Hello"));
    }

    InterfaceHavingStaticMethod intf = s -> System.out.println(s);
}