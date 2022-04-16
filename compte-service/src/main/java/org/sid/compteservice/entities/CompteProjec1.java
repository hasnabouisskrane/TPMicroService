package org.sid.compteservice.entities;


import org.sid.compteservice.enums.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="p1",types = Compte.class)
public interface CompteProjec1 {
     Long getCode();
     double getSolde();
     TypeCompte getType();
}
