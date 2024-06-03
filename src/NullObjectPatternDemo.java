import com.DesignPattern.Behavioral.NullObject.*;

public class NullObjectPatternDemo {

    private Logger logger;

    public NullObjectPatternDemo(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        // Some operations
        logger.log("Operation performed");
    }

    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger nullLogger = new NullLogger();

        NullObjectPatternDemo appWithConsoleLogger = new NullObjectPatternDemo(consoleLogger);
        NullObjectPatternDemo appWithFileLogger = new NullObjectPatternDemo(fileLogger);
        NullObjectPatternDemo appWithNullLogger = new NullObjectPatternDemo(nullLogger);

        appWithConsoleLogger.doSomething(); // Logs to console
        appWithFileLogger.doSomething(); // Logs to file (simplified to console for illustration)
        appWithNullLogger.doSomething(); // Does nothing
    }
}
