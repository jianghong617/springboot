package org.example.springboot.util;

/**
 * {@code HardwareUtils}
 *
 * @author jianghong
 * @date 2023/10/25
 * @since 2.3.0
 */
public final class HardwareUtils {

    private static final int NCPU = Runtime.getRuntime().availableProcessors();

    private HardwareUtils() {
        throw new AssertionError("No " + this.getClass().getName() + " instances for you!");
    }

    public static int getNcpu() {
        return NCPU;
    }

    public static int getDoubleNcpu() {
        return NCPU << 1;
    }
}