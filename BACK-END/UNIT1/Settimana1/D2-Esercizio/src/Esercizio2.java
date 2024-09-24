public class Esercizio2 {
    public String letter(int num) {
        switch (num){
            case 0:
                return "ZERO";
            case 1:
                return "UNO";
            case 2:
                return "DUE";
            case 3:
                return "TRE";
            default:
                return "ERROR 104...";
        }
    }

    public String splitString(String str) {
        String[] a = str.split("");
        String b = "";
        for(int i = 0; i < a.length; i++){
            b += a[i].concat(",");
        }
        return b;
    }

    public int counterToZero(int numberZero) {
        int result = numberZero;
        for(int i = result; i >= 0; i-- ){
           result = i;
            System.out.println(result);
        }
        return result;

    }
}