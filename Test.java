import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CALCULATRICE");
        System.out.print("Entrez le premier nombre : ");
        double n1 = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre : ");
        double n2 = scanner.nextDouble();
        
        System.out.println("Quelle opération souhaitez-vous effectuer ?");
        System.out.println("1. Addition (+)");
        System.out.println("2. Soustraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Votre Choix : ");
        int choix = scanner.nextInt();
        
        double res = 0;
        switch (choix) {
            case 1:
                res = Calculatrice.addition(n1, n2);
                break;
            case 2:
                res = Calculatrice.soustraction(n1, n2);
                break;
            case 3:
                res = Calculatrice.multiplication(n1, n2);
                break;
            case 4:
                try {
                    res = Calculatrice.division(n1, n2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Choix invalide");
                return;
        }
        
        System.out.println("Le résultat de l'opération est : " + res);
    }
}