public class ColorPrint {
    private static final String red    = "\u001b[00;31m";
    private static final String green  = "\u001b[00;32m";
    private static final String yellow = "\u001b[00;33m";
    private static final String purple = "\u001b[00;34m";
    private static final String pink   = "\u001b[00;35m";
    private static final String cyan   = "\u001b[00;36m";   
    private static final String def    = "\u001b[00m";

    public static void redPrintf(String format, Object ... args) {
        System.out.printf("%s", red);
        System.out.printf(format, args);
        System.out.printf("%s", def);
    }
    
    public static void greenPrintf(String format, Object ... args) {
        System.out.printf("%s", green);
        System.out.printf(format, args);
        System.out.printf("%s", def);
    }
    
    public static void yellowPrintf(String format, Object ... args) {
        System.out.printf("%s", yellow);
        System.out.printf(format, args);
        System.out.printf("%s", def);  
    }
    
    public static void purplePrintf(String format, Object ... args) {
        System.out.printf("%s", purple);
        System.out.printf(format, args);
        System.out.printf("%s", def);
    }
    
    public static void pinkPrintf(String format, Object ... args) {
        System.out.printf("%s", pink);
        System.out.printf(format, args);
        System.out.printf("%s", def);
    }
    
    public static void cyanPrintf(String format, Object ... args) {
        System.out.printf("%s", cyan);
        System.out.printf(format, args);
        System.out.printf("%s", def);
    }
}
