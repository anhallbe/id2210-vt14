/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tman.system.peer.tman;

import common.peer.AvailableResources;
import java.io.Serializable;
import se.sics.kompics.address.Address;

/**
 *
 * @author Andreas
 */
public class PeerDescriptorTMan implements Serializable {
    private static final long serialVersionUID = 1L;
    private Address address;
    private AvailableResources availableResources;

    public PeerDescriptorTMan(Address address, AvailableResources availableResources) {
        this.address = address;
        this.availableResources = availableResources;
    }
    
    public int getFreeCPUs() {
        return availableResources.getNumFreeCpus();
    }
    
    public int getFreeMem() {
        return availableResources.getFreeMemInMbs();
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
}
