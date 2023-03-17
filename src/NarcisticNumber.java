public class NarcisticNumber {
    public static void main(String[] args) {
        System.out.println(checkNarsistic(1634));
        System.out.println(checkNarsistic(111));
    }

    public static boolean checkNarsistic(int angka){
        boolean resultBoolean = false;
        String angkaString = String.valueOf(angka);
        int lengthAngkaString = angkaString.length();
        int finalCount = 0;
        for(int i=0; i<lengthAngkaString; i++){
            var pow = (int) Math.pow(Integer.parseInt(String.valueOf(angkaString.charAt(i))),lengthAngkaString);
            finalCount = finalCount+pow;
        }
        if(String.valueOf(finalCount).length() == String.valueOf(angka).length()){
            resultBoolean = true;
        }
        return resultBoolean;
    }
}
