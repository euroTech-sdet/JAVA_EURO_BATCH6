package days.day41;

public class MixCodingQuestions {

    public static void main(String[] args) {

        loginPasswordValidation("3!!!121312312");
    }


//    Q1 Let's write Java method for your application that can verify if app login password is a valid password.
//    Valid passwords Rules:
//        1- Must be at least have 10 characters long(inc), at max 15 characters long(inc), and should not contain white space
//        2- Must contain at least  1 upper case letter
//        3- Must contain at least  1 lower case letter
//        4- Must contain at least  1 special characters
//        5- Must contain at least  1 numeric digit

    // OUTPUT: If it is valid, print valid confirm message, if it is not, print the related only 1 reason messages with failure (according to rule order)


    public static void loginPasswordValidation(String password) {


        boolean rule1 = false; // length rule
        boolean rule2 = false; //upper case letter
        boolean rule3 = false; //lower case letter
        boolean rule4 = false; //special characters
        boolean rule5 = false; //numeric digit

        rule1 = password.length() >= 10 && password.length() <= 15 && !password.contains(" ");


        // try to change with while loop!!!!
        for (char c : password.toCharArray()) {
            if(!rule1){
                break;
            }
            if (rule2 && rule3 && rule4 && rule5) {
                break;
            }

            if (Character.isUpperCase(c)) {
                rule2 = true;
            } else if (Character.isLowerCase(c)) {
                rule3 = true;
            } else if (Character.isDigit(c)) {
                rule5 = true;
            } else { // if c is not letter and not digit, it means that it is CHARACTER!!!
                rule4 = true;
            }
        }

        String result="";
//        rule1 && rule2 && rule3 && rule4 && rule5  -- > VALID!!!
        if(rule1 && rule2 && rule3 && rule4 && rule5){
            result = "Password is valid!";
        } else if(!rule1){
            result = "INVALID PASSWORD! It must be at least have 10 characters long(inc), at max 15 characters long(inc), and should not contain white space";
        } else if(!rule2){
            result = "INVALID PASSWORD! It must contain at least  1 upper case letter ";
        }else if(!rule3){
            result = "INVALID PASSWORD! It must contain at least  1 lower case letter ";
        }else if(!rule4){
            result = "INVALID PASSWORD! It must contain at least  1 special characters ";
        }else {
            result = "INVALID PASSWORD! It must contain at least  1 numeric digit ";
        }

        System.out.println("Result = " + result);

    }
}
