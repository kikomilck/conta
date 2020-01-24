package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Empresa;

public interface EmpresaRepository  extends JpaRepository<Empresa, Long>{
	
	Empresa findByCnpj(String cnpj);

}
