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

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class MobiledeviceSession extends AbstractFacade<Mobiledevice> implements MobiledeviceSessionRemote {

    @PersistenceContext(unitName = "corePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MobiledeviceSession() {
        super(Mobiledevice.class);
    }
    
    @Override
    public Mobiledevice findByGuid(String guid) {
        Query q = em.createQuery("SELECT m FROM Mobiledevice m WHERE m.mdevGuid = :guid");
        return (Mobiledevice) q.setParameter("guid", guid).getSingleResult();
    }

}
