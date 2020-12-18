package com.navettevatry.rem4u.comparator.comparatorLogic;

//import com.google.common.collect.ComparisonChain;
import com.navettevatry.rem4u.common.resources.dto.standard.VTCLocation;
import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.comparators.ComparatorChain;
import org.apache.commons.lang3.builder.CompareToBuilder;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Chakib Daii.
 * this class was created for testing purposes
 */
public class ComparisonAlternatives {

    //Sorting with Java 8 lambda's
    public static List<VTCLocation> java8ComparatorSorting(List<VTCLocation> vtcLocations){
        System.out.println("Sorting with Java 8 lambda's");
        Comparator comparator = Comparator.comparing(VTCLocation::getAddress)
                .thenComparing(VTCLocation::getLatitude)
                .thenComparing(VTCLocation::getLongitude)
                .thenComparing(VTCLocation::getId);

        Collections.sort(vtcLocations, comparator);
        System.out.println(vtcLocations);
        return vtcLocations;
    }

    //Sorting with BeanComparator
    public static List<VTCLocation> beanComparatorSorting(List<VTCLocation> vtcLocations){
        System.out.println("Sorting with BeanComparator");
        ComparatorChain comparator = new ComparatorChain(Arrays.asList(
                new BeanComparator("address"),
                new BeanComparator("longitude"),
                new BeanComparator("id"),
                new BeanComparator("latitude")));

        Collections.sort(vtcLocations, comparator);
        System.out.println(vtcLocations);
        return vtcLocations;
    }

    //Sorting with Google Guava’s ComparisonChain
//    public static List<VTCLocation> GoogleGuavaComparisonChainSorting(List<VTCLocation> vtcLocations){
//        System.out.println("Sorting with Google Guava’s ComparisonChain");
//        Comparator comparator = new Comparator<VTCLocation>() {
//            @Override
//            public int compare(VTCLocation l1, VTCLocation l2) {
//
//                return ComparisonChain.start().compare(l1.getAddress(), l2.getAddress())
//                        .compare(l1.getId(), l2.getId())
//                        .compare(l1.getLongitude(), l2.getLongitude())
//                        .compare(l1.getLatitude(), l2.getLatitude()).result();
//                // or in case the fields can be null:
//                /*
//                return ComparisonChain.start()
//                   .compare(l1.size, l2.size, Ordering.natural().nullsLast())
//                   .compare(l1.nrOfToppings, l2.nrOfToppings, Ordering.natural().nullsLast())
//                   .compare(l1.name, l2.name, Ordering.natural().nullsLast())
//                   .result();
//                */
//            }
//        };
//
//        Collections.sort(vtcLocations, comparator);
//
//        return vtcLocations;
//    }
    //Sorting with Apache Commons CompareToBuilder
    public static List<VTCLocation> ApacheCommonsCompareToBuilderSorting(List<VTCLocation> vtcLocations){
        System.out.println("Sorting with Apache Commons CompareToBuilder");
        Comparator comparator = new Comparator<VTCLocation>() {
            @Override
            public int compare(VTCLocation l1, VTCLocation l2) {
                return new CompareToBuilder().append(l1.getLatitude(), l2.getLatitude())
                        .append(l1.getAddress(), l2.getAddress())
                        .append(l1.getId(), l2.getId())
                        .append(l1.getLatitude(), l2.getLongitude()).toComparison();
            }
        };
        Collections.sort(vtcLocations, comparator);
        System.out.println(vtcLocations);
        return vtcLocations;
    }
}
