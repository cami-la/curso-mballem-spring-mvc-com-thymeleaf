package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario funcionario);

	void update(Funcionario funcionario);

	void delete(Long id);

	Funcionario finById(Long id);

	List<Funcionario> findAll();

}
