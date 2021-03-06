package it.marcellorinaldo.server;

public class Main {

    private static String PORT_OPTION = "-p";
    private static String HELP_OPTION = "-h";

    public static void main(String[] args) {
        int port = 80;
        boolean help = false;

        for (int i=0; i<args.length; i++) {
            if (args[i].equals(PORT_OPTION)) {
                port = Integer.parseInt(args[++i]);
            }
            if (args[i].equals(HELP_OPTION)) {
                help = true;
            }
        }

        if (help) {
            printUsage();
        }

        System.out.println("Starting webserver @localhost:" + port);
        new WebServer(port).start();
        System.out.println("Webserver started. Press CTRL+C to stop it.");
    }

    private static void printUsage() {
        System.out.println("Usage: ");
        System.out.println("\t-h: print help information");
        System.out.println("\t-p <port>: the port where to run the webserver (default is 80)");
    }
}
