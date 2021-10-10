public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
        int temperatur = -4;
        boolean rutischigeFahrbahn = false;
        boolean winterreifenPflicht = isWinterreifenPflicht(temperatur, rutischigeFahrbahn);
        if (winterreifenPflicht == true) {
            System.out.println("Bitte Winterreifen verwenden");
        }
        else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }

    }

    public static boolean isWinterreifenPflicht (int temperatur, boolean rutschigeFahrbahn){
        if ((temperatur < 10 && rutschigeFahrbahn == true) || temperatur < 4) {
            return true;}
            else {
                return false;

        }
    }
}
