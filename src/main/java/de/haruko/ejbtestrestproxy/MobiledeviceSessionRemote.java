/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 20.01.2018, 13:43:26
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.ejbtestrestproxy;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author stefanhahn
 */
@Local
@Remote
public interface MobiledeviceSessionRemote {

    void create(Mobiledevice mobiledevice);

    void edit(Mobiledevice mobiledevice);

    void remove(Mobiledevice mobiledevice);

    Mobiledevice find(Object id);

    List<Mobiledevice> findAll();

    List<Mobiledevice> findRange(int[] range);

    int count();
    
    Mobiledevice findByGuid(String guid);

}
