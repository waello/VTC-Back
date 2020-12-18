package com.navettevatry.rem4u.common.utils.enrichers.averageValue;

public class BlocSansMarqueEconomique {
//    private static VoitureC4Eco voitureC4Eco;
//    private static VoiturePegeuot308Eco voiturePegeuot308Eco;
//    private static VoitureMeganeEco voitureMeganeEco;

    public static int getAverageValue(){
        int[] numbers = new int[]{VoitureC4Eco.ValeurMoyenneEssenceDiesel(),VoitureMeganeEco.ValeurMoyenneEssenceDiesel(),VoiturePegeuot308Eco.ValeurMoyenneEssenceDiesel()};
        int somme = 0;

        for(int i=0; i < numbers.length ; i++)
            somme = somme + numbers[i];

        //calculer la moyenne
        int ValeurMoyene = somme / numbers.length;

        return  ValeurMoyene;
    }
}
