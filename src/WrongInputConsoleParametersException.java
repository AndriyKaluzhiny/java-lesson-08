public class WrongInputConsoleParametersException extends Throwable {

    public WrongInputConsoleParametersException(String input) {
        System.err.println(input + " " + "Wrong input, try another one: ");
    }

}
