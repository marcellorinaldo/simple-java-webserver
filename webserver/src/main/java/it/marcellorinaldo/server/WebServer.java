package it.marcellorinaldo.server;

public class WebServer {

    private static String PORT_OPTION = "-p";
    private static String HELP_OPTION = "-h";

    public static void main(String[] args) {
        int port = 80;
        boolean help = false;
        for(int i=0; i<args.length; i++) {
            if(args[i].equals(PORT_OPTION)) {
                port = Integer.parseInt(args[++i]);
            }
            if(args[i].equals(HELP_OPTION)) {
                help = true;
            }
        }

        if(help) {
            printUsage();
        }

        System.out.println("Starting webserver @localhost:" + port);
    }

    private static void printUsage() {
        System.out.println("Usage: ");
        System.out.println("\t-p <port>: the port where to run the webserver (default is 80)");
    }
}
