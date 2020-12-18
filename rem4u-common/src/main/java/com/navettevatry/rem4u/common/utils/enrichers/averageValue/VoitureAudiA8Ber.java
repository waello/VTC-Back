package com.navettevatry.rem4u.common.utils.enrichers.averageValue;

public class VoitureAudiA8Ber {

    public static int ValeurMoyenneEssence() {

        int[] numbers = new int[]{258,171,171,254};
        int somme = 0;

        for(int i=0; i < numbers.length ; i++)
            somme = somme + numbers[i];

        //calculer la moyenne
        int moyenneEssence = somme / numbers.length;

        return  moyenneEssence;
    }

    public static int ValeurMoyenneDiesel() {

        int[] numbers = new int[]{142,142,194,193};
        int somme = 0;

        for(int i=0; i < numbers.length ; i++)
            somme = somme + numbers[i];

        //calculer la moyenne
        int moyenneDiesel = somme / numbers.length;

        return  moyenneDiesel;
    }
    public static int ValeurMoyenneEssenceDiesel() {
        int[] numbers = new int[]{ValeurMoyenneEssence(),ValeurMoyenneDiesel()};

        int somme = 0;

        for(int i=0; i < numbers.length ; i++)
            somme = somme + numbers[i];

        //calculer la moyenne
        int moyenneED = somme / numbers.length;

        return  moyenneED;
    }

}
