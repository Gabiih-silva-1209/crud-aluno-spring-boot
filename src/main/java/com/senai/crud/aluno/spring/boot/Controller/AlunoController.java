package com.senai.crud.aluno.spring.boot.Controller;

import com.senai.crud.aluno.spring.boot.Model.Aluno;
import com.senai.crud.aluno.spring.boot.Model.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/aluno")
public class AlunoController {
    @Autowired
    private AlunoRepository alunoRepository;

    //Método para criar e salvar um novo aluno - criar um registro no banco de dados
    @PostMapping
    public Aluno salvarAluno(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }
    //Método para listar todos os alunos
    @GetMapping
    public List<Aluno> getAllAluno(){
        return alunoRepository.findAll();
    }
    @GetMapping("/{id}")
    public Aluno getAlunoByID (@PathVariable String id){
        return alunoRepository.findById(id)
                .orElseThrow(( ) -> new RuntimeException("Aluno não encontrado"));
    }
    @PutMapping("/{id}")
    public Aluno updateAluno (@PathVariable String id, @RequestBody Aluno alunoDetails){
        Aluno aluno = alunoRepository.findById(id)
                .orElseThrow (() -> new RuntimeException("Aluno não encontrado!!"));

        aluno. setNome(alunoDetails.getNome());
        aluno.setCpf(alunoDetails.getCpf());
        aluno.setCurso(alunoDetails.getCurso());
        aluno.setEmail(alunoDetails.getEmail());
        aluno.setCurso(alunoDetails.getCurso());
        aluno.setId(alunoDetails.getId());
                return alunoRepository.save(aluno);
    }
}
