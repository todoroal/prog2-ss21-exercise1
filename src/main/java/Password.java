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

            char[] list = pw.toCharArray();

            //Minimum 1 lower and 1 upper Case
            int upperCase=0, lowCase=0, numbers=0, specialChar=0;
            boolean continuousNumbs=false, sameNubs=false;

            for(int i=0; i<list.length; i++){
                if(list[i]>=65 && list[i]<=90){
                    upperCase++;
                }
                if(list[i]>=97 && list[i]<=122){
                    lowCase++;
                }
                if(list[i]>=48 && list[i]<=57){
                    numbers++;
                }
                if(list[i] == '(' || list[i] == ')' || list[i] == '$' || list[i] == '?' || list[i] == '!' || list[i] == '%' || list[i] == '/' || list[i] == '@'){
                    specialChar++;
                }
                if(i>2){
                    if(list[i]==list[i-1]+1 && list[i]==list[i-2]+2){
                        continuousNumbs = true;
                    }
                }
                if(i>3){
                    if(list[i]==list[i-1] && list[i]==list[i-2] && list[i]==list[i-3]){
                        sameNubs = true;
                    }
                }
            }
            if(upperCase>0 && lowCase>0 && numbers>0 && specialChar>0 && !continuousNumbs && !sameNubs){
                if(upperCase+lowCase+numbers+specialChar == list.length){
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }

    public String getPassword() {
        return Password;
    }
}
