/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transport;

/**
 *
 * @author nupur
 */
public class TransportNames {
    private String transportName;
    private float price;

   
    private String transID;
    private String transRoute;
    private String transType;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
    public String getTransID() {
        return transID;
    }

    public void setTransID(String transID) {
        this.transID = transID;
    }

    public String getTransRoute() {
        return transRoute;
    }

    public void setTransRoute(String transRoute) {
        this.transRoute = transRoute;
    }
    public String getTransportName() {
        return transportName;
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }
  
   
     @Override
    public String toString(){
    return transportName;
    }
    
}
