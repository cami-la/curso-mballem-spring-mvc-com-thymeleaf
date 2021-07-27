package com.mballem.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.domain.Cargo;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

	@Override
	public Cargo finById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
