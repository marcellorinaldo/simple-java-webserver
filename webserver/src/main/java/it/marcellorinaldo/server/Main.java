package it.marcellorinaldo.server;

public class Main {

    private static String PORT_OPTION = "-p";
    private static String HELP_OPTION = "-h";
    private static String FILEPATH_OPTION = "-f";

    public static void main(String[] args) {
        int port = 80;
        boolean help = false;
        String filepath = "";

        for(int i=0; i<args.length; i++) {
            if(args[i].equals(PORT_OPTION)) {
                port = Integer.parseInt(args[++i]);
            }
            if(args[i].equals(HELP_OPTION)) {
                help = true;
            }
            if(args[i].equals(FILEPATH_OPTION)) {
                filepath = args[++i];
            }
        }

        if(help) {
            printUsage();
        }

        System.out.println("Starting webserver @localhost:" + port);

        new WebServer(port, filepath).start();
    }

    private static void printUsage() {
        System.out.println("Usage: ");
        System.out.println("\t-h: print help information");
        System.out.println("\t-p <port>: the port where to run the webserver (default is 80)");
        System.out.println("\t-f <path>: filepath to the html file");
    }
}
