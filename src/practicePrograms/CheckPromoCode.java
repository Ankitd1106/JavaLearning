package practicePrograms;

public class CheckPromoCode {
    public static void checkCode() {
//        Scanner data = new Scanner(System.in);
//        System.out.print("Enter the promotional code to validate: "); //AF3-FJK-418
//        String code = data.nextLine();
//
//        System.out.printf("You have entered : %s", code);

        String code = "AF3-PJK-418";
        checkValidCode(code);

    }

    static void checkValidCode(String code) {
        String[] partsOfCode = code.split("-");

        //checking format
        boolean format = code.matches("[A-Z]{2}\\d-[A-Z]{3}-\\d{3}");

        //checking check digit
        int checkDigit = Character.getNumericValue(partsOfCode[0].charAt(2) + Character.getNumericValue(partsOfCode[2].charAt(0)) + Character.getNumericValue(partsOfCode[2].charAt(1))) % 10;
        boolean checkDigitValid = checkDigit == Character.getNumericValue(partsOfCode[2].charAt(2));

        if (format && checkDigitValid) {
            System.out.println("You have got a " + Character.getNumericValue(partsOfCode[0].charAt(2)) * 10 + "% discount");
        } else {
            System.out.println("Promo code is invalid");
        }

    }

}
