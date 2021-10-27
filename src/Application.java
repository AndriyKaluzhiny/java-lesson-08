import java.util.Scanner;

/**
 * @params sc, sc7, sc10Input, sc4Input, sc3, sc4, sc3Input
 * @exception WrongInputConsoleParametersException
 * @author Andriy Kaluzhniy
 */

public class Application {

    public static void menu() {
        System.out.println("If you want to see Task 1, please type 1");
        System.out.println("If you want to see Task 2, please type 2");
        System.out.println("If you want to see Task 3, please type 3");
        System.out.println("If you want to see Task 4, please type 4");
        System.out.println("If you want to see Task 5, please type 5");
        System.out.println("If you want to see Task 6, please type 6");
        System.out.println("If you want to see Task 7, please type 7");
        System.out.println("If you want to see Task 8, please type 8");
        System.out.println("If you want to see Task 9, please type 9");
        System.out.println("If you want to see Task 10, please type 10");
        System.out.println("If you want to exit, please type 0");
    }

    public static void main(String[] args) throws WrongInputConsoleParametersException {

        Month [] monthsValues = Month.values();
        Season [] s = Season.values();
        menu();

        Scanner sc = new Scanner(System.in);
        String input = sc.next();




        switch (input) {
            case "0":
                System.exit(1);

            case "1": {
                Scanner month = new Scanner(System.in);
                String monthInput = month.next().toUpperCase();
                boolean flag = false;
                for (Month mon : monthsValues) {
                    if (mon.name().equals(monthInput)) {
                        System.out.println("Month exists!");
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    throw new WrongInputConsoleParametersException(monthInput);
                }
                break;
            }

            case "2": {
                System.out.println("Enter Season!");
                Scanner month = new Scanner(System.in);
                String monthInput = month.next().toUpperCase();

                boolean flag = false;

                for (Month t2Month : monthsValues) {
                    if (t2Month.getS().name().equals(monthInput)) {
                        flag = true;
                    }
                }

                if (flag) {
                    Season season = Season.valueOf(monthInput);
                    for (Month mon : monthsValues) {
                        if (mon.getS().toString().equalsIgnoreCase(monthInput)) {
                            System.out.println(mon);
                        }
                    }
                }
                if (!flag) {
                    throw new WrongInputConsoleParametersException(monthInput);
                }
                break;
            }

            case "3": {
                System.out.println("Enter days: ");
                Scanner sc3 = new Scanner(System.in);

                String sc3Input = sc3.next().toUpperCase();
                boolean flag = false;

                for (Month month : monthsValues) {
                    if (month.DaystoString().equals(sc3Input)) {
                        flag = true;
                    }
                }

                if (flag) {
                    for (Month mon : monthsValues) {
                        if (mon.DaystoString().equals(sc3Input)) {
                            System.out.println(mon);
                        }
                    }
                }

                if (!flag) {
                    throw new WrongInputConsoleParametersException(sc3Input);
                }
                break;
            }

            case "4": {
                for (Month mon : monthsValues) {
                    if (mon.getDays() - 31 < 0) {
                        System.out.println(mon + " " + "Days: " + mon.getDays());
                        break;
                    }
                }
                break;
            }

            case "5": {
                for (Month mon : monthsValues) {
                    if (mon.getDays() + 31 > 61) {
                        System.out.println(mon + " " + "Days: " + mon.getDays());
                        break;
                    }
                }
                break;
            }

            case "6": {
                System.out.println("Enter month: ");
                Scanner sc4 = new Scanner(System.in);

                String sc4Input = sc4.next().toUpperCase();
                boolean flag = false;
                for (Month mon : monthsValues) {
                    if (mon.name().equalsIgnoreCase(sc4Input)) {
                        flag = true;
                    }
                }

                if (flag) {
                    Month monValOf = Month.valueOf(sc4Input);
                    int ordinal = monValOf.ordinal();

                     if (ordinal == (monthsValues.length - 1)) {
                         ordinal = 0;
                         System.out.println(monthsValues[ordinal]);
                     } else {
                         System.out.println(monthsValues[ordinal + 1]);
                         break;
                     }
                }

                if (!flag) {
                    throw new WrongInputConsoleParametersException(sc4Input);
                }
            }

            case "7":  {
                System.out.println("Enter month: ");
                Scanner sc7 = new Scanner(System.in);

                String sc4Input = sc7.next().toUpperCase();
                boolean flag = false;
                for (Month mon : monthsValues) {
                    if (mon.name().equalsIgnoreCase(sc4Input)) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    Month monValOf = Month.valueOf(sc4Input);
                    int ordinal = monValOf.ordinal();

                    if (ordinal == (monthsValues.length + 1)) {
                        ordinal = 0;
                        System.out.println(monthsValues[ordinal]);
                    } else {
                        System.out.println(monthsValues[ordinal - 1]);
                        break;
                    }
                }
                if (!flag) {
                    throw new WrongInputConsoleParametersException(sc4Input);
                }
            }

            case "8": {
                for (Month mon : monthsValues) {
                    if (mon.getDays() % 2 == 0) {
                        System.out.println("Pair: " + mon);
                    }
                }
            }

            case "9": {
                for (Month mon : monthsValues) {
                    if (mon.getDays() % 2 != 0) {
                        System.out.println("Unpair: " + mon);
                    }
                }
            }

            case "10": {
                System.out.println("Enter month: ");
                Scanner sc10 = new Scanner(System.in);

                String sc10Input= sc10.next().toUpperCase();
                boolean flag = false;

                for (Month mon : monthsValues) {
                    if (mon.name().equalsIgnoreCase(sc10Input))
                        flag = true;
                    else
                        throw new WrongInputConsoleParametersException(sc10Input);
                }

                if (flag) {
                    Month m = Month.valueOf(sc10Input);

                    if (m.getDays() % 2 == 0) {
                        System.out.println("Pair " + m);
                    } else {
                        System.out.println("Unpair");
                        break;
                    }
                }
            }
            default:
                throw new WrongInputConsoleParametersException(input);
        }
    }
}
