/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 20.01.2018, 08:19:42
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.ejbtestrestproxy;

import javax.enterprise.inject.Model;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Model
public class StatelessSessionBusinessImpl implements StatelessSessionBusinessValidation {
    @Override
    public String hello() {
        return "ich sage hello";
    }
    
    @Override
    public String sayWhat(@NotNull @Size(min=1) String what, @NotNull Mobiledevice mobiledevice) {
        return what + " device " + mobiledevice.getMdevName();
    }
}
