package com.senai.crud.aluno.spring.boot.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data // envolve todos os elementos comentados anteriormente
@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected String id;

    @NotBlank(message = "O nome do aluno não pode estar vazio")
    @Column(nullable = false, length = 100)
    protected String nome;

    @NotNull(message = "O CPF não pode estar vazio")
    @Column(nullable = false, length = 11)
    protected String cpf;

    protected int idAcesso;

    @NotBlank(message = "O E-mail não pode estar vazio")
    @Column(nullable = false, length = 100)
    protected String email;

    protected String curso;

}