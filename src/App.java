
interface Logger {
    void log(String message);
    void error(String message);
}

class AsteriskLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    @Override
    public void error(String message) {
        System.out.println("****************");
        System.out.println("***Error: " + message + "***");
        System.out.println("****************");
    }
}

class SpacedLogger implements Logger {
    @Override
    public void log(String message) {
        String spacedMessage = String.join(" ", message.split(""));
        System.out.println(spacedMessage);
    }

    @Override
    public void error(String message) {
        String spacedError = String.join(" ", ("ERROR: " + message).split(""));
        System.out.println(spacedError);
    }
}
public class App {
    public static void main(String[] args) {

        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();


        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");
        System.out.println();

        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}
