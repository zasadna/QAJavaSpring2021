package com.epam.test.automation.java.practice14.advanced.task14;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class Task14 {
    private Task14() {
    }

    public static List<ShopWithMaxDiscountOwner> getShopsWithMaxDiscountOwners(List<Supplier> supplierList, List<SupplierDiscount> supplierDiscountList) {
        return supplierDiscountList.stream().collect(groupingBy(SupplierDiscount::getStoreName, maxBy(comparingInt(SupplierDiscount::getDiscountPercentage)))).values().stream().map(x->new ShopWithMaxDiscountOwner(x.get().getStoreName(), supplierList.stream().filter(y->y.getCustomerId()==x.get().getCustomerId()).findFirst().orElse(null))).sorted(Comparator.comparing(ShopWithMaxDiscountOwner::getStoreName)).collect(Collectors.toList());
    }
}
