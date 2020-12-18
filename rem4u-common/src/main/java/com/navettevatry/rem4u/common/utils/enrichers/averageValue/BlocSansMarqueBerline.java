package com.navettevatry.rem4u.common.utils.enrichers.averageValue;

public class BlocSansMarqueBerline {
//    private static VoitureAudiA8Ber voitureAudiA8Ber;
//    private static VoiturePegeuot508Ber voiturePegeuot508Ber;
//    private static VoitureSkodaBer voitureSkodaBer;

    public static int getAverageValue(){
        int[] numbers = new int[]{VoitureAudiA8Ber.ValeurMoyenneEssenceDiesel(),VoiturePegeuot508Ber.ValeurMoyenneEssenceDiesel(),VoitureSkodaBer.ValeurMoyenneEssenceDiesel()};
        int somme = 0;

        for(int i=0; i < numbers.length ; i++)
            somme = somme + numbers[i];

        //calculer la moyenne
        int ValeurMoyene = somme / numbers.length;

        return  ValeurMoyene;
    }
}
