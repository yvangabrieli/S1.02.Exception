package nivel2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {
    private static final Scanner sc;

    public static byte readByte(String message) {
        while(true) {
            System.out.print(message);

            try {
                byte n = sc.nextByte();
                sc.nextLine();
                return n;
            } catch (InputMismatchException var2) {
                System.out.println("Format ERROR: Please enter a number between 0 to 127.");
                sc.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while(true) {
            System.out.print(message);

            try {
                int num = sc.nextInt();
                sc.nextLine();
                return num;
            } catch (InputMismatchException var2) {
                System.out.println("Format ERROR: Please enter an Integer number.");
                sc.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while(true) {
            System.out.println(message);

            try {
                float d = sc.nextFloat();
                return d;
            } catch (InputMismatchException var2) {
                System.out.println("Format ERROR: Please enter a Decimal number");
                sc.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while(true) {
            System.out.println(message);

            try {
                double num = sc.nextDouble();
                sc.nextLine();
                return num;
            } catch (InputMismatchException var3) {
                System.out.println("Format ERROR: Please enter a Decimal number");
                sc.nextLine();
            }
        }
    }

    public static char readChar(String message) throws EntryException {
        while(true) {
            System.out.println(message);
            String letter = sc.nextLine();

            try {
                if (letter.length() == 1) {
                    return letter.charAt(0);
                }

                throw new EntryException("You must enter a single character");
            } catch (EntryException e) {
                System.out.println("Format ERROR: " + e.getMessage());
            }
        }
    }

    public static String readString(String message) throws EntryException {
        while(true) {
            System.out.println(message);
            String word = sc.nextLine();

            try {
                if (!word.trim().isEmpty()) {
                    return word;
                }

                throw new EntryException("The String cannot be empty.");
            } catch (EntryException e) {
                System.out.println("Format ERROR: " + e.getMessage());
            }
        }
    }

    public static Boolean readBoolean(String message) throws EntryException {
        while(true) {
            System.out.println(message);
            String input = sc.nextLine().trim().toLowerCase();

            try {
                if (input.equals("s")) {
                    return true;
                }

                if (input.equals("n")) {
                    return false;
                }

                throw new EntryException("You must enter 's' or 'n'.");
            } catch (EntryException e) {
                System.out.println("Format ERROR" + e.getMessage());
            }
        }
    }

    static {
        sc = new Scanner(System.in);
    }
}
