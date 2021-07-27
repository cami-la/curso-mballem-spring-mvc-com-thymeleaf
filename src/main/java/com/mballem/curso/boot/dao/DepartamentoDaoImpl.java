package com.mballem.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.domain.Departamento;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao{

	@Override
	public Departamento finById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
