import logger.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger logger =  Logger.getInstance();
        logger.info("TEST INFO MESSAGE");
        logger.debug("TEST DEBUG MESSAGE");
        logger.error("TEST ERROR MESSAGE");
    }
}