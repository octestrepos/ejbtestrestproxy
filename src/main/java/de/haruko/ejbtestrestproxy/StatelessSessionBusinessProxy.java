/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 20.01.2018, 08:28:22
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.ejbtestrestproxy;

import javax.enterprise.inject.Model;

@Model
public class StatelessSessionBusinessProxy extends StatelessSessionBusinessImpl {
    
    public StatelessSessionBusinessProxy() {
    }
              
    @Override
    public String hello() {
        return "vorher -> " + super.hello() + " --> nacher";        
    }

    @Override
    public String sayWhat(String what, Mobiledevice mobiledevice) {
        try {
            return "vorher -> " + super.sayWhat(what, mobiledevice) + " --> nacher";
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
