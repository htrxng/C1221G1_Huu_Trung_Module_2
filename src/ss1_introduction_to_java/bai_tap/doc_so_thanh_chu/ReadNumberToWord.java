package ss1_introduction_to_java.doc_so_thanh_chu;

import java.util.Scanner;

public class ReadNumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Number need speak: ");
        int num = scanner.nextInt();
        String numSpeak = null;
        if (num >= 0 && num < 10) {
            switch (num) {
                case 0:
                    numSpeak = "zero";
                    break;
                case 1:
                    numSpeak = "one";
                    break;
                case 2:
                    numSpeak = "two";
                    break;
                case 3:
                    numSpeak = "three";
                    break;
                case 4:
                    numSpeak = "four";
                    break;
                case 5:
                    numSpeak = "five";
                    break;
                case 6:
                    numSpeak = "six";
                    break;
                case 7:
                    numSpeak = "seven";
                    break;
                case 8:
                    numSpeak = "eigth";
                    break;
                case 9:
                    numSpeak = "nine";
                    break;
                default:
                    System.out.print("out of ability");
                    break;
            }
            if (!numSpeak.equals("")) {
                System.out.printf("%s", numSpeak);
            } else {
                System.out.print("out of ability");
            }
        } else if (num < 20) {
            switch (num) {
                case 10:
                    numSpeak = "ten";
                    break;
                case 11:
                    numSpeak = "eleven";
                    break;
                case 12:
                    numSpeak = "twelve";
                    break;
                case 13:
                    numSpeak = "thirteen";
                    break;
                case 14:
                    numSpeak = "fourteen";
                    break;
                case 15:
                    numSpeak = "fifteen";
                    break;
                case 16:
                    numSpeak = "sixteen";
                    break;
                case 17:
                    numSpeak = "seventeen";
                    break;
                case 18:
                    numSpeak = "eighteen";
                    break;
                case 19:
                    numSpeak = "nineteen";
                    break;
            }
            if (!numSpeak.equals("")) {
                System.out.printf("%s", numSpeak);
            } else {
                System.out.print("out of ability");
            }
        } else if (num < 100) {
            int tens = num / 10;
            int ones = num % (tens * 10);
            String temp;
            switch (tens) {
                case 2:
                    numSpeak = "twenty";
                    break;
                case 3:
                    numSpeak = "thirty";
                    break;
                case 4:
                    numSpeak = "fourty";
                    break;
                case 5:
                    numSpeak = "fifty";
                    break;
                case 6:
                    numSpeak = "sixty";
                    break;
                case 7:
                    numSpeak = "seventy";
                    break;
                case 8:
                    numSpeak = "eighty";
                    break;
                case 9:
                    numSpeak = "ninety";
                    break;
            }
            temp = numSpeak;
            switch (ones) {
                case 1:
                    numSpeak = "one";
                    break;
                case 2:
                    numSpeak = "two";
                    break;
                case 3:
                    numSpeak = "three";
                    break;
                case 4:
                    numSpeak = "four";
                    break;
                case 5:
                    numSpeak = "five";
                    break;
                case 6:
                    numSpeak = "six";
                    break;
                case 7:
                    numSpeak = "seven";
                    break;
                case 8:
                    numSpeak = "eigth";
                    break;
                case 9:
                    numSpeak = "nine";
                    break;
                default:
                    numSpeak = "";
                    break;
            }
            System.out.printf(temp + " %s", numSpeak);
        } else if (num < 1000) {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int ones = num % (hundreds * 100 + tens * 10);
            String temp;
            switch (hundreds) {
                case 1:
                    numSpeak = "one hundred";
                    break;
                case 2:
                    numSpeak = "two hundred";
                    break;
                case 3:
                    numSpeak = "three hundred";
                    break;
                case 4:
                    numSpeak = "four hundred";
                    break;
                case 5:
                    numSpeak = "five hundred";
                    break;
                case 6:
                    numSpeak = "six hundred";
                    break;
                case 7:
                    numSpeak = "seven hundred";
                    break;
                case 8:
                    numSpeak = "eight hundred";
                    break;
                case 9:
                    numSpeak = "nine hundred";
                    break;
            }
            temp = numSpeak;
            switch (tens) {
                case 2:
                    numSpeak = "twenty";
                    break;
                case 3:
                    numSpeak = "thirty";
                    break;
                case 4:
                    numSpeak = "fourty";
                    break;
                case 5:
                    numSpeak = "fifty";
                    break;
                case 6:
                    numSpeak = "sixty";
                    break;
                case 7:
                    numSpeak = "seventy";
                    break;
                case 8:
                    numSpeak = "eighty";
                    break;
                case 9:
                    numSpeak = "ninety";
                    break;
            }
            if (tens > 1) {
                temp += numSpeak;
                switch (ones) {
                    case 1:
                        numSpeak = "one";
                        break;
                    case 2:
                        numSpeak = "two";
                        break;
                    case 3:
                        numSpeak = "three";
                        break;
                    case 4:
                        numSpeak = "four";
                        break;
                    case 5:
                        numSpeak = "five";
                        break;
                    case 6:
                        numSpeak = "six";
                        break;
                    case 7:
                        numSpeak = "seven";
                        break;
                    case 8:
                        numSpeak = "eigth";
                        break;
                    case 9:
                        numSpeak = "nine";
                        break;
                    default:
                        numSpeak = "";
                        break;
                }
                System.out.printf(temp + " %s", numSpeak);
            } else if (tens == 1) {
                switch (ones) {
                    case 1:
                        numSpeak = "eleven";
                        break;
                    case 2:
                        numSpeak = "twelve";
                        break;
                    case 3:
                        numSpeak = "thirteen";
                        break;
                    case 4:
                        numSpeak = "fourteen";
                        break;
                    case 5:
                        numSpeak = "fifteen";
                        break;
                    case 6:
                        numSpeak = "sixteen";
                        break;
                    case 7:
                        numSpeak = "seventeen";
                        break;
                    case 8:
                        numSpeak = "eighteen";
                        break;
                    case 9:
                        numSpeak = "nineteen";
                        break;
                    default:
                        numSpeak = "";
                        break;
                }
                System.out.printf(temp + "%s", numSpeak);
            } else if (tens == 0) {
                switch (ones) {
                    case 1:
                        numSpeak = "one";
                        break;
                    case 2:
                        numSpeak = "two";
                        break;
                    case 3:
                        numSpeak = "three";
                        break;
                    case 4:
                        numSpeak = "four";
                        break;
                    case 5:
                        numSpeak = "five";
                        break;
                    case 6:
                        numSpeak = "six";
                        break;
                    case 7:
                        numSpeak = "seven";
                        break;
                    case 8:
                        numSpeak = "eigth";
                        break;
                    case 9:
                        numSpeak = "nine";
                        break;
                    default:
                        numSpeak = "";
                }
                System.out.printf(temp + "%s", numSpeak);
            }
        }
    }
}
