public class ColorPrint {
    private static final String RED    = "\u001b[00;31m";
    private static final String GREEN  = "\u001b[00;32m";
    private static final String YELLOW = "\u001b[00;33m";
    private static final String PURPLE = "\u001b[00;34m";
    private static final String PINK   = "\u001b[00;35m";
    private static final String CYAN   = "\u001b[00;36m";   
    private static final String DEF    = "\u001b[00m";

    public static void redPrintf(String format, Object ... args) {
        System.out.printf("%s", RED);
        System.out.printf(format, args);
        System.out.printf("%s", DEF);
    }
    
    public static void greenPrintf(String format, Object ... args) {
        System.out.printf("%s", GREEN);
        System.out.printf(format, args);
        System.out.printf("%s", DEF);
    }
    
    public static void yellowPrintf(String format, Object ... args) {
        System.out.printf("%s", YELLOW);
        System.out.printf(format, args);
        System.out.printf("%s", DEF);  
    }
    
    public static void purplePrintf(String format, Object ... args) {
        System.out.printf("%s", PURPLE);
        System.out.printf(format, args);
        System.out.printf("%s", DEF);
    }
    
    public static void pinkPrintf(String format, Object ... args) {
        System.out.printf("%s", PINK);
        System.out.printf(format, args);
        System.out.printf("%s", DEF);
    }
    
    public static void cyanPrintf(String format, Object ... args) {
        System.out.printf("%s", CYAN);
        System.out.printf(format, args);
        System.out.printf("%s", DEF);
    }
}
