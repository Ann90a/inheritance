package trancport;

public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String country,
                     String color,
                     int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            color = "белый";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            maxSpeed = 120;
        }
        this.maxSpeed = maxSpeed;
    }
}

