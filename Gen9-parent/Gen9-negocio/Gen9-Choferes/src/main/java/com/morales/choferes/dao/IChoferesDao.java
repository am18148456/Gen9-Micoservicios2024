package com.morales.choferes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morales.choferes.models.Chofer;

public interface IChoferesDao extends JpaRepository<Chofer,Long> {
    


}
