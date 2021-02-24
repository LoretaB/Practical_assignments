import java.text.DecimalFormat;
import java.util.Hashtable;
import java.util.Map;

public class Task3_HashTable {

    public static DecimalFormat df = new DecimalFormat("0.00");

    public static int howManyUnder1eur(Map<String, Double> map) {
        int counter = 0;
        for (double price : map.values()) {
            if (price < 1) {
                counter++;
            }
        }
        return counter;
    }

    public static String whichPriceLowest(Map<String, Double> map) {
        String minProduct = null;
        double minPrice = Double.MAX_VALUE;
        for (String product : map.keySet()) {
            double price = map.get(product);
            if (price < minPrice) {
                minProduct = product;
                minPrice = price;
            }
        }
        return minProduct;
    }

    public static String whichPriceLargest(Map<String, Double> map) {
        String maxProduct = null;
        double maxPrice = Double.MIN_VALUE;
        for (String product : map.keySet()) {
            double price = map.get(product);
            if (price > maxPrice) {
                maxProduct = product;
                maxPrice = price;
            }
        }
        return maxProduct;
    }

    public static void sortedHashTable(Hashtable<String, Double> map) {
        map.entrySet().stream()
                .sorted((k1, k2) -> +k1.getValue().compareTo(k2.getValue()))
                .forEach(k -> System.out.print(" " + df.format(k.getValue()) + " = " + k.getKey() + " "));
    }

    public static void main(String[] args) {
        Hashtable<String, Double> priceMap = new Hashtable<>();
        priceMap.put("Bread", 0.90);
        priceMap.put("Milk", 1.90);
        priceMap.put("Butter", 1.80);
        priceMap.put("Water", 0.45);
        priceMap.put("Juice", 1.20);
        priceMap.put("Cake", 9.80);
        priceMap.put("Eggs", 1.67);
        priceMap.put("Sausage", 4.60);
        priceMap.put("Potatoes", 9.1);
        System.out.format("%d products are under 1 EUR\n" +
                "%s price is the lowest\n" +
                "%s price is the largest\n" +
                "", howManyUnder1eur(priceMap), whichPriceLowest(priceMap), whichPriceLargest(priceMap));

        Hashtable<String, Double> priceMap2 = new Hashtable<>();
        priceMap2.put("Honey", 0.80);
        priceMap2.put("Chocolate", 2.50);
        priceMap2.put("Tomatoes", 3.80);
        priceMap2.put("Cucumbers", 1.45);
        priceMap2.put("Onions", 0.70);
        priceMap2.put("Mushrooms", 2.55);
        priceMap2.put("Oil", 2.67);
        priceMap2.put("Potatoes", 1.71);


        //merging method with .merge and setting average price, if products are equal in two maps
        Hashtable<String, Double> priceMapMerged = new Hashtable<>(priceMap);
        priceMap2.forEach((key, value) -> priceMapMerged.merge(key, value, (v1, v2) -> (v1 + v2) / 2));
        System.out.println("Merged HashMap is: ");
        priceMapMerged.forEach((key, value) -> System.out.print(" " + key + " = " + df.format(value)));
        System.out.format("\nThere are %d products in merged Hashtable \n", priceMapMerged.size());

        //sorting ascending
        System.out.println("Sorted HashMap: ");
        sortedHashTable(priceMapMerged);
    }
}
