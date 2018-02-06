/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Transport;

import java.util.ArrayList;

/**
 *
 * @author nupur
 */
public class TransportNamesDirectory {
    private ArrayList <TransportNames> transportNames;

    public ArrayList<TransportNames> getTransportNames() {
        return transportNames;
    }

    public void setTransportNames(ArrayList<TransportNames> transportNames) {
        this.transportNames = transportNames;
    }
    public TransportNamesDirectory(){
        transportNames = new ArrayList<>();
    }
    public TransportNames addTransport(String transName,String transID,String transRoute,String transTyoe,float price){
        TransportNames transportName = new TransportNames();
        transportName.setTransportName(transName);
        transportName.setPrice(price);
        transportName.setTransRoute(transRoute);
        transportName.setTransID(transID);
        transportName.setTransType(transTyoe);
        transportNames.add(transportName);
        return transportName;
    }
}
