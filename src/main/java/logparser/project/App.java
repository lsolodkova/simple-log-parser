package logparser.project;

import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;
import static org.realityforge.jsyslog.message.SyslogMessage.*;
import net.sourceforge.argparse4j.ArgumentParsers;

public class App {
    public void run(String[] args) {
        ArgumentParser parser = ArgumentParsers.newFor("simple-log-parser").build()
                .description("Filters given logfile by the given timestamp.");
        parser.addArgument("--file")
                .dest("filename")
                .type(String.class)
                .help("log file path")
                .required(true);
        parser.addArgument("--timestamp")
                .dest("timestamp")
                .type(String.class)
                .help("Timestamp in the format:\n\tYYYY-MM\n\tYYYY-MM-DD\n\thh:mm:ss\n\thh:mm:ss-hh:mm:ss");
        try {
            Namespace res = parser.parseArgs(args);


        } catch (ArgumentParserException e) {
            parser.handleError(e);
        }
    }
}
