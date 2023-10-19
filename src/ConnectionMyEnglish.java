public class ConnectionMyEnglish implements IConnectionEnglish {

    public void connection() {
        System.out.println("Welcome to wikipedia in English ");
    }
    public String runQuery() {
        return " ¿What is the computer programing?\n" +
                "Learn about computer programming with online courses.\n" +
                "Computer programming is any process that involves the design, " +
                "coding, maintenance and protection of any source of programs.\n" +
                "The main objective of computer programming is the creation of software," +
                " in order to be executed through computers, programs or platforms.";
    }
}
