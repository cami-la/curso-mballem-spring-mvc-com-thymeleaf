package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Cargo;

public interface CargoDao {

	void save(Cargo cargo);

	void update(Cargo cargo);

	void delete(Long id);

	Cargo finById(Long id);

	List<Cargo> findAll();

}
