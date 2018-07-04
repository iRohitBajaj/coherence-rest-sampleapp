package com.travelers.fred.fredrestapp.utils;

import java.io.IOException;

import com.tangosol.io.pof.PofReader;
import com.tangosol.io.pof.PofSerializer;
import com.tangosol.io.pof.PofWriter;
import com.travelers.fred.fredrestapp.FredConfig;

public class FredConfigSerializer 
//implements PofSerializer<Object> 
{/*

    
    
    public void serialize(PofWriter writer, Object o) throws IOException {

    	FredConfig p = (FredConfig) o;
        writer.writeString(IS_LEGACY_FLAG, p.getIsLegacy());
        writer.writeRemainder(null);

    }

    public Object deserialize(PofReader reader) throws IOException {
        
        String isLegacyFlag = reader.readString(IS_LEGACY_FLAG);
        FredConfig p = new FredConfig();
        p.setIsLegacy(isLegacyFlag);
        reader.readRemainder();
        return p;
    }
    
    public static final int IS_LEGACY_FLAG = 1;
    
*/}