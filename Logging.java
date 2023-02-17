
import java.util.Scanner;

/**
* Calculates how many logs of a certain size a truck can carry.
*
* @author  Keiden B
* @version 1.0
* @since   2023-02-16
*/

public final class Logging {
    /**
    * Necessary to prevent HideUtilityClass Error.
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */
    private Logging() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Main lines of code.
    *
    * @param args a placeholder value when making the main function
    */
    public static void main(String[] args) {
        final Scanner get = new Scanner(System.in);
        final int truckMax = 1100;
        final int logWeight = 20;

        System.out.println("Hi! This finds how many logs of a certain"
            + " size can fit on one of our company-owned trucks.\n"
            + "What size are the logs to be loaded? (0.25, 0.5, 1m)");
        final String logSize = get.nextLine();

        try {
            final float logSizeFloat = Float.parseFloat(logSize);

            if (logSizeFloat == 0.25 || logSizeFloat == 0.5
                || logSizeFloat == 1) {
                final float maxLogs = truckMax / (logWeight * logSizeFloat);

                System.out.printf("The truck can hold a max of %.0f"
                    + " logs of that size\n", maxLogs);
            } else {
                System.out.println("Please enter a valid size!");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid size! "
                + error.getMessage());
        }
        get.close();
    }
}
