
public class RemoveVowels {
    public String[] vowelsRemove(String[] instruments) {


        for (int i = 0; i < instruments.length; i++) {
            instruments[i] = instruments[i].replaceAll("[aAEeiIOouU]", "");
            System.out.println(instruments[i]);
        }
        return instruments;

    }

    public String nullPointerException(String s) {

        String jay="";
        if (s == "") {
            jay = "input string cannot be null";

        }

        return jay;
    }



    public String numericalValues(String s){
        String jay="";
        if (!s.matches("[a-zA-Z_]+")) {

            jay = "input string should have only characters";

        }

        return jay;

    }
}