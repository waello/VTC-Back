package com.navettevatry.rem4u.common.utils.enrichers.averageValue;

public class BlocSansMarqueBusiness {
//    private static BlocSansMarqueBerline blocSansMarqueBerline;
//    private static BlocSansMarqueVip blocSansMarqueVip;

    public static int getAverageValue(){
        int[] numbers = new int[]{BlocSansMarqueBerline.getAverageValue(), BlocSansMarqueVip.getAverageValue()};
        int somme = 0;

        for(int i=0; i < numbers.length ; i++)
            somme = somme + numbers[i];

        //calculer la moyenne
        int ValeurMoyene = somme / numbers.length;

        return  ValeurMoyene;
    }

}
