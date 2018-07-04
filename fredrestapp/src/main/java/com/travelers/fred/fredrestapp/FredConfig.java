package com.travelers.fred.fredrestapp;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="fredconfig")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class FredConfig implements Serializable{
    
	private static final long serialVersionUID = 2563197732262242446L;

	public FredConfig() {
      
    }
    
    public FredConfig(String isLegacy) {
        this.isLegacy = isLegacy;
    }

private String isLegacy;

    public void setIsLegacy(String isLegacy) {
        this.isLegacy = isLegacy;
    }

    public String getIsLegacy() {
        return isLegacy;
    }
}
