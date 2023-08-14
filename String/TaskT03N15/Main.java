package String.TaskT03N15;

public class Main {
    public static void main(String[] args) {
        //Пароли в приложении хранить в том виде, в котором нам прислали пользователи нельзя. Это не секьюрно,
        // потому что данные могут похитить и воспользоваться. Чтобы этого избежать мы их шифруем.
        //Задание. Реализовать свой простой шифр. Нужно написать два метода - один шифрует,
        // другой дешефрует. Шифруем следующим образом. Дана строка, которая содержит только латиницу и цифры.
        // Число нужно увеличить на 1 (если 9, то должно получиться 0). Если буква в верхнем регистре, то заменить на нижний.
        // Если буква в нижнем регистре, то заменить на верхний.
        //Например, 1Valera987 -> 2vALERA098
        String password = "AominE777";
        String encrypted = coding(password);
        System.out.println(encrypted);
        String decrypt = decoding(password);
        System.out.println(decrypt);

    }
    public static String coding(String password){
        StringBuilder stringBuilder = new StringBuilder();
        for (char arr1 : password.toCharArray()) {
            if (Character.isUpperCase(arr1)){
                 stringBuilder.append(Character.isLowerCase(arr1));
            } else if (Character.isLowerCase(arr1)) {
                stringBuilder.append((Character.isUpperCase(arr1)));
            } else if (Character.isDigit(arr1)){
                int digit = Character.getNumericValue(arr1);
                int encryptedDigit = (digit + 1) %10;
               stringBuilder.append(encryptedDigit);
            } else{
                stringBuilder.append(arr1);
            }
        }
            return  stringBuilder.toString();

    }
        public static String decoding (String password){
            StringBuilder stringBuilder = new StringBuilder();
            for (char arr1 : password.toCharArray()) {
                if (Character.isUpperCase(arr1)){
                    stringBuilder.append(Character.isLowerCase(arr1));
                } else if (Character.isLowerCase(arr1)) {
                    stringBuilder.append((Character.isUpperCase(arr1)));
                } else if (Character.isDigit(arr1)){
                    int digit = Character.getNumericValue(arr1);
                    int encryptedDigit = (digit + 10) %10;
                    stringBuilder.append(encryptedDigit);
                } else{
                    stringBuilder.append(arr1);
                }
            }
            return  stringBuilder.toString();
        }
}
