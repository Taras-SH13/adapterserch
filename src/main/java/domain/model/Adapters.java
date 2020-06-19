package domain.model;

import java.util.Set;

public class Adapters {
    private String name;
    private String supply;
    private Double power;
    private Double voltage;
    private Double amperage;
    private String connector;
    private Long id;
    private Set<Laptops> compatibleLaptops;
    private Integer cost;

    public Adapters(String name, String supply, Double power, Double voltage, Double amperage, String connector, Long id) {
        this.name = name;
        this.supply = supply;
        this.power = power;
        this.voltage = voltage;
        this.amperage = amperage;
        this.connector = connector;
        this.id = id;
    }
}

