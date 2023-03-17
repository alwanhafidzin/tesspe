public class NeedleInHaystack {
    public static void main(String[] args) {
        String[] arrayString = {"red","blue","yellow","black","grey"};
        int testFindNiddle =findNeedle(arrayString,"blue");
        System.out.println(testFindNiddle);
    }

    public static int findNeedle(String[] arrayString,String valueToSearch){
        for(int i=0; i<arrayString.length; i++){
            if(arrayString[i].equals(valueToSearch)){
                return i;
            }
        }
        throw new IllegalArgumentException("No Array Index Found");
    }
}
