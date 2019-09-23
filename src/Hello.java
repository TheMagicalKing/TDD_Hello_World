/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 23/09/2019
 */

public class Hello {

    public static String getHelloNavn(String navn) {

        // TODO - If russian name, then Привет
        if (navn.trim().equals("")) {
            return "Hello!";
        } else {
            return "Hello " + navn + "!";
        }

    }
}
