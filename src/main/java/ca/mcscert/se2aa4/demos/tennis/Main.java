package ca.mcscert.se2aa4.demos.tennis;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static int PLAYER1_STRENGTH;
    public static int PLAYER2_STRENGTH;

    protected static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("** Starting Tennis Counter Assistant");
        logger.info("**** Reading Command-Line Arguments");
        Options options = new Options();
        options.addOption("p1", true, "Strength of Player 1 in [0,100]");
        options.addOption("p2", true, "Strength of Player 2 in [0,100]");
        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            PLAYER1_STRENGTH = Integer.parseInt(cmd.getOptionValue("p1","50"));
            logger.info("****** P1's Strength is " + PLAYER1_STRENGTH+"/100");
            PLAYER2_STRENGTH = Integer.parseInt(cmd.getOptionValue("p2","50"));
            logger.info("****** P2's Strength is " + PLAYER2_STRENGTH+"/100");
        } catch (ParseException pe) {
            logger.error("An error has occurred");
        }
        logger.info("**** Starting game");
        logger.info("** TODO...");
        logger.info("** Closing Tennis Counter Assistant");
    }
}
