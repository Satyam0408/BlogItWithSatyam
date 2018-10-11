package java_8_Optional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        // isPresent
        Optional<String> opt = Optional.of("blogItWithSatyam");
        System.out.println(opt.isPresent());

        // ifPresent
        Optional<String> opt1 = Optional.of("blogItWithSatyam");
        opt1.ifPresent(String -> System.out.println(String));

        // get
        Optional<String> o = Optional.of("abc");
        System.out.println(o.get());

        // ofNullable
        /*
         * Optional<String> opt2 = Optional.ofNullable(null);
         * System.out.println(opt2.get());
         */

        // orElse & orElseGet
        String nullValue1 = null;
        String v1 = Optional.ofNullable(nullValue1)
            .orElse("blogItWithSatyam");
        System.out.println(v1);

        String nullValue2 = null;
        String v2 = Optional.ofNullable(nullValue2)
            .orElseGet(() -> "blogItWithSatyam");
        System.out.println(v2);
    }
}
