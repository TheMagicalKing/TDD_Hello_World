import junit.framework.TestCase;

public class HelloTest extends TestCase {

    public void testGetHelloNavn() {
        String resultat;

        resultat = Hello.getHelloNavn("Laila");
        assertEquals("Hello Laila!", resultat);

        resultat = Hello.getHelloNavn("Toke");
        assertEquals("Hello Toke!", resultat);

        resultat = Hello.getHelloNavn("René");
        assertEquals("Hello René!", resultat);

        resultat = Hello.getHelloNavn("System.out.println(\"noget\")");
        assertEquals("Hello System.out.println(\"noget\")!", resultat);
    }

    public void testGetHelloNavnForEmptyInput() {
        String resultat;

        resultat = Hello.getHelloNavn("");
        assertEquals("Hello!", resultat);

        resultat = Hello.getHelloNavn(" ");
        assertEquals("Hello!", resultat);

        resultat = Hello.getHelloNavn("    ");
        assertEquals("Hello!", resultat);

    }

    public void testGetHelloNavnForRussianChars() {
        String resultat;
        resultat = Hello.getHelloNavn("Станислав");
        assertEquals("Привет Станислав!", resultat);


    }

}