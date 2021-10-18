class task13 {
    /*
    13.	Создайте программу, которая осуществляет шифрование / расшифровка
    методом простой замены. В нем каждый символ незашифрованного текста
    из исходного алфавита заменяется другим из алфавита,
    символы в каком представлены в соответствии с ключом шифрования.
     */
    public static StringBuffer encrypt(String text, int key) {
        char currentEl;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            currentEl = text.charAt(i);
            if (Character.isLetter(currentEl)){
                if (Character.isUpperCase(currentEl)){
                    char encryptedCh = (char)((currentEl + key - 'A') % 26 + 'A');
                    result.append(encryptedCh);
                } else {
                    char encryptedCh = (char)((currentEl + key - 'a') % 26 + 'a');
                    result.append(encryptedCh);
                }
            } else
                result.append(currentEl);
        }
        return result;
    }

    public static StringBuffer decrypt(String text, int key) {
        char currentEl;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            currentEl = text.charAt(i);
            if (Character.isLetter(currentEl)){
                if (Character.isUpperCase(currentEl)){
                    char decryptedCh = (char)((currentEl - key - 'Z') % 26 + 'Z');
                    result.append(decryptedCh);
                } else {
                    char decryptedCh = (char)((currentEl - key - 'z') % 26 + 'z');
                    result.append(decryptedCh);
                }
            } else
                result.append(currentEl);
        }
        return result;
    }

    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No string to reverse!");
            return;
        }
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        int key = 1;
        for (String arg : args) {
            System.out.printf("\nEncrypted %s - %s\nDecrypted %s - %s\n", arg, encrypt(arg, key), arg, decrypt(arg, key));
        }

    }

}

