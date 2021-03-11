public class Password {

    private String Password;

    public Password (String pw){
        this.Password = pw;
    }

    /*  • Das Kennwort muss zwischen 8 und 25 Zeichen lang sein
        • Das Kennwort muss aus Klein- und Großbuchstaben bestehen.
        • Das Kennwort muss Zahlen enthalten.
        • Das Kennwort muss mindestens eines der folgenden Sonderzeichen enthalten:
          ()#$?!%/@ Andere Sonderzeichen sind nicht erlaubt.*/

    boolean checkPassword(String pw){

        //Length between 8 -25 ???
        if(pw.length()<=25 && pw.length()>=8){
            //Allgemein praktisch
            char[] list = pw.toCharArray();

            //Minimum 1 lower and 1 upper Case
            int upperCase=0, lowCase=0;
            for(int i=0; i<list.length; i++){
                if(list[i]>=65 && list[i]<=90){
                    upperCase++;
                }
                if(list[i]>=97 && list[i]<=122){
                    lowCase++;
                }
            }
            if(upperCase==0 || lowCase==0){
                return false;
            }
            else return true;
        }
        else return false;
    }


    public String getPassword() {
        return Password;
    }
}
