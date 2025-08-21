package com.senai.crud.aluno.spring.boot.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, String> {
}
