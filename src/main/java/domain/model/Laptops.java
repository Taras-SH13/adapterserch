package domain.model;

import java.util.List;
import java.util.Set;

public class Laptops {
    private final static String ASUS_BREND = "Asus"; // константы с названием брендов производителей.
    private String name;
    private String brand;
    private String series;
    private String model;
    private static Long id;
    private Set<Adapters> compatibleAdapters;

    public Laptops(String name, String brand, String series, String model, Set<Adapters> compatibleAdapters) {
        this.name = name;
        this.brand = brand;
        this.series = series;
        this.model = model;
        this.compatibleAdapters = compatibleAdapters;
        id++;
    }

    public Laptops(String name, Set<Adapters> compatibleAdapters) {
        this.name = name;
        this.brand = ASUS_BREND;
        this.compatibleAdapters = compatibleAdapters;
        id++;
    }
}

