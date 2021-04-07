/*
 * Implementation of UserIO interface
 */
package com.sg.classroster.ui;

import java.util.Scanner;

/**
 *
 * @author barin
 */
public class UserIOImpl implements UserIO {

    Scanner sc = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        String stringInput = "";
        int input = 0;

        boolean isValid = true;
        while (isValid) {
            try {
                stringInput = sc.nextLine();
                input = Integer.parseInt(stringInput);
                isValid = false;
            } catch (NumberFormatException e) {
                System.out.println("Make sure you enter an integer!");
                isValid = true;
            }
        }
        return input;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        String stringInput = "";
        int input = 0;

        boolean isValid = true;
        while (isValid) {
            try {
                stringInput = sc.nextLine();
                input = Integer.parseInt(stringInput);
                if (input >= min && input <= max) {
                    isValid = false;
                } else {
                    System.out.println("Please make sure the integer entered "
                            + "is between " + min + " and " + max + "!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Make sure you enter an integer!");
                isValid = true;
            }
        }
        return input;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        String stringInput = "";
        double input = 0;

        boolean isValid = true;
        while (isValid) {
            try {
                stringInput = sc.nextLine();
                input = Double.parseDouble(stringInput);
                isValid = false;
            } catch (NumberFormatException e) {
                System.out.println("Make sure you enter a number!");
                isValid = true;
            }
        }
        return input;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        String stringInput = "";
        double input = 0;

        boolean isValid = true;
        while (isValid) {
            try {
                stringInput = sc.nextLine();
                input = Double.parseDouble(stringInput);
                if (input >= min && input <= max) {
                    isValid = false;
                } else {
                    System.out.println("Please make sure the number entered "
                            + "is between " + min + " and " + max + "!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Make sure you enter a number!");
                isValid = true;
            }
        }
        return input;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        String stringInput = "";
        float input = 0;

        boolean isValid = true;
        while (isValid) {
            try {
                stringInput = sc.nextLine();
                input = Float.parseFloat(stringInput);
                isValid = false;
            } catch (NumberFormatException e) {
                System.out.println("Make sure you enter a number!");
                isValid = true;
            }
        }
        return input;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
        String stringInput = "";
        float input = 0;

        boolean isValid = true;
        while (isValid) {
            try {
                stringInput = sc.nextLine();
                input = Float.parseFloat(stringInput);
                if (input >= min && input <= max) {
                    isValid = false;
                } else {
                    System.out.println("Please make sure the number entered "
                            + "is between " + min + " and " + max + "!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Make sure you enter a number!");
                isValid = true;
            }
        }
        return input;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        String stringInput = "";
        long input = 0;

        boolean isValid = true;
        while (isValid) {
            try {
                stringInput = sc.nextLine();
                input = Long.parseLong(stringInput);
                isValid = false;
            } catch (NumberFormatException e) {
                System.out.println("Make sure you enter a number!");
                isValid = true;
            }
        }
        return input;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        String stringInput = "";
        long input = 0;

        boolean isValid = true;
        while (isValid) {
            try {
                stringInput = sc.nextLine();
                input = Long.parseLong(stringInput);
                if (input >= min && input <= max) {
                    isValid = false;
                } else {
                    System.out.println("Please make sure the number entered "
                            + "is between " + min + " and " + max + "!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Make sure you enter a number!");
                isValid = true;
            }
        }
        return input;
    }

}
