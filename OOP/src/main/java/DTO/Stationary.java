package DTO;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Stationary extends Products {
     private String stationaryId;
     private StaTypes staTypes;
     private String brand;
     private String material;
     private String source;

     public Stationary () {}

     public Stationary (String productId, String productName, String productBrand, LocalDate releaseDate, BigDecimal productPrice, 
      int quantity, String stationaryId, String typeId, String brand , String material, String source) {
          super(productId, productName, releaseDate, productPrice, quantity);
          this.stationaryId = stationaryId;
          this.Statypes.getTypeId() = typeId;
          this.brand = brand;
          this.material = material;
          this.source = source;
     }

     public String getStationaryId () {
          return this.stationaryId;
     }

     public String getTypeId () {
          return this.stationaryType.getTypeId();
     }

     public String getBrand() {
          return this.brand;
     }

     public String getMaterial () {
          return this.material;
     }

     public String getSource () {
          return this.source;
     }

     public void setStationaryId (String stationaryId) {
          this.stationaryId = stationaryId;
     }

     public void setTypeId (String typeId) {
          this.stationaryType.setTypeId(typeId);
     }

     public void setBrand (String brand) {
          this.brand = brand;
     }

     public void setMaterial (String material) {
          this.material = material;
     }

     public void setSource (String source) {
          this.source = source;
     }

     @Override
     protected String productIdModifier (String stationaryId) {
          return "STN" + stationaryId + "PD";
     }

     @Override
     public void showInfo() {
          // TODO Auto-generated method stub
          throw new UnsupportedOperationException("Unimplemented method 'showInfo'");
     }
}

