public class TestLogger {
    public static void main(String[] args) {
        Logger logger = new DateLogger();
        logger.log("First log");
        logger.log(4, "Second message");
        logger.setLevel(5);
        logger.log(4, "Third message");
        logger.log(10,"Fourth message");
        logger.log("Fifth message");

    }

}
