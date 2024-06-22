package com.logger;

import java.io.*;

public class Logger {

    public static final String fileName = "logger.txt";

    private PrintWriter printWriter = null;
    private static Logger logger = null;

    private Logger() {
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static Logger getInstance() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }


    public void log(String message) {
        this.printWriter.println(message);
    }

}
