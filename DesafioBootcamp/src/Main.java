public class Main {
    public static void main(String[] args) {
       //Essa é  uma calculadora de rank solicitada em um bootcamp da DIO
       //Originalmente feita em Javascript e convertida em JAVA. 
        System.out.println(calculateRank(60, 20));
    }

    public static String calculateRank(int victories, int defeats) {
        
        int balance = victories - defeats;

        
        String rank;
        if (victories < 10) {
            rank = "Ferro";
        } else if (victories <= 20) {
            rank = "Bronze";
        } else if (victories <= 50) {
            rank = "Prata";
        } else if (victories <= 80) {
            rank = "Ouro";
        } else if (victories <= 90) {
            rank = "Diamante";
        } else if (victories <= 100) {
            rank = "Lendário";
        } else {
            rank = "Imortal";
        }

        
        return "O Herói tem de saldo de " + balance + " está no nível de " + rank;
    }
}
