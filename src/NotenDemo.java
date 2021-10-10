public class NotenDemo {
    public static void main(String[] args) {
        int punkte = 77;
        System.out.println(getNotentext(punkte));

    }

    public static String getNotentext(int punkte) {
        if (punkte >= 90) {
            return "Sehr gut";
        } else if (punkte >= 78 && punkte < 90) {
            return "Gut";
        }
        else if (punkte >= 65 && punkte < 78) {
            return "Befriedigend";
        }
        else if (punkte >= 51 && punkte < 65) {
            return "Genügend";
        }
        else return "Ungenügend";
    }
}
