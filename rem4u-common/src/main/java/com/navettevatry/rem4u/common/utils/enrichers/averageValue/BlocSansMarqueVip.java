package com.navettevatry.rem4u.common.utils.enrichers.averageValue;

public class BlocSansMarqueVip {
//    private VoitureMercedesClasse_CVip voitureMercedesClasse_cVip;
//    private VoitureMercedesClasse_SVip voitureMercedesClasseSVip;

    public static int getAverageValue(){
        int[] numbers = new int[]{VoitureMercedesClasse_CVip.ValeurMoyenneEssenceDiesel(),VoitureMercedesClasse_SVip.ValeurMoyenneEssenceDiesel()};
        int somme = 0;

        for(int i=0; i < numbers.length ; i++)
            somme = somme + numbers[i];

        //calculer la moyenne
        int ValeurMoyene= somme / numbers.length;

        return  ValeurMoyene;
    }
}
