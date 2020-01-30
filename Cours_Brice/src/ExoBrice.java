import java.util.Arrays;

import static java.util.Arrays.sort;

public class ExoBrice {

    public static void main(String[] args) {

        /* 2 A
        * int indexOf(String) retourne l'index de la première lettre de la première occurence
        * de la chaine de charactère émise, ou -1, si elle n'apparaît pas
         */
        String a = "hello world!";
        System.out.println(a.indexOf("world")); // affiche 6
        System.out.println(a.indexOf("nice")); // affiche -1

        /* 2 B
         * int indexOf(int, int)
         * contrairement à ce que l'on pense, le premier argument n'est pas un chiffre mais la valeur d'un caractère unicode
         * la méthode permet ainsi de retourne l'occurence d'un caractère choisi à partir de l'index donné du String
         * ou -1 si la lettre n'apparait plus à partir de l'index donné (ou pas du tout)
         */
        String b = "coucou Brice";
        System.out.println(b.indexOf('c', 2)); // affiche 3
        System.out.println(b.indexOf('c', 7)); // affiche 10
        System.out.println(b.indexOf('q', 7)); // affiche -1

        // Exercice
        String exo1 = "instance de string";
        System.out.println(exo1.indexOf('s', exo1.indexOf('s')+1)); // affiche normalement 12

        /* 2 C
         *  String[] split(String regex)
         * Un regexp est un pattern d'apparition de caractères ex: ^[0-9] permet d'afficher tous les chiffres d'un String
         * Permet de diviser un String en plusieurs en les coupant à chaque occurence du regex ; le regex est enlever dans le process
         */

        String c = "Hello 006 je suis 007";
        System.out.println(Arrays.toString(c.split(" "))); // [Hello, 006, je, suis, 007]
        String exo2 = "Hello 006  je suis 007";

        System.out.println(Arrays.toString(c.split(" "))); // [Hello, 006, je, suis, 007]
        System.out.println(Arrays.toString(exo2.split(" "))); // [Hello, 006, , je, suis, 007

        String[] splitted = c.split(" ");
        for (int i=0; i < splitted.length; i++){
            System.out.println(splitted[i] + "-- size= " + splitted[i].length());
        }

        /* 3 A
         * static void sort(int[] a) permet de trier un tableau par valeur croissante
         * la méthode est appelée sur un objet de type tableau et le modifie (ne crée pas une copie)
         * copie = modifications dessus ne modifie pas l'objet de base (envoyer un document word à qqun)
         * référence = modification de l'objet de base (ex: faire réparer sa moto)
         */
        int[] tab = {8, 5, 3, 1};
        sort(tab);
        System.out.println(Arrays.toString(tab));


    }
}
