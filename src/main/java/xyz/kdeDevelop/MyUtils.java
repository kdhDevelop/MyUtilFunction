package xyz.kdeDevelop;

public class MyUtils {
    /**
     * sleep thread.
     * @param second
     */
    public static void sleep(int second) {
        try {
            Thread.sleep(second * 10000);
        } catch (Exception ignore) {}
    }
}
