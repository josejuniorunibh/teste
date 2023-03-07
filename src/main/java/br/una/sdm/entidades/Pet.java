package br.una.sdm.entidades;

import java.util.Date;

public class Pet {
    
private Long id;
private String nome;
private Date dtNascimento;
private String descricao;

public Pet() {
}

public Pet(Long id, String nome, Date dtNascimento, String descricao) {
    this.id = id;
    this.nome = nome;
    this.dtNascimento = dtNascimento;
    this.descricao = descricao;
}


@Override
public String toString() {
    return "Pet [id=" + id + ", nome=" + nome + ", dtNascimento=" + dtNascimento + ", descricao=" + descricao + "]";
}


@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    result = prime * result + ((dtNascimento == null) ? 0 : dtNascimento.hashCode());
    result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
    return result;
}

@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Pet other = (Pet) obj;
    if (id == null) {
        if (other.id != null)
            return false;
    } else if (!id.equals(other.id))
        return false;
    if (nome == null) {
        if (other.nome != null)
            return false;
    } else if (!nome.equals(other.nome))
        return false;
    if (dtNascimento == null) {
        if (other.dtNascimento != null)
            return false;
    } else if (!dtNascimento.equals(other.dtNascimento))
        return false;
    if (descricao == null) {
        if (other.descricao != null)
            return false;
    } else if (!descricao.equals(other.descricao))
        return false;
    return true;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Date getDtNascimento() {
    return dtNascimento;
}

public void setDtNascimento(Date dtNascimento) {
    this.dtNascimento = dtNascimento;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}





}
