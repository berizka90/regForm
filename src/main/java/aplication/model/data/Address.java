package aplication.model.data;


public class Address {
    private String cityIndex;
    private String city;
    private String street;
    private String houseNumber;
    private String apartmentNumber;

    public void setCityIndex(String cityIndex) {
        this.cityIndex = cityIndex;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return  new StringBuilder().append(this.city).append(", str. ").append(this.street).append(", house ").
                append(this.houseNumber).append(", room. ").append(this.apartmentNumber).toString();
    }
}
