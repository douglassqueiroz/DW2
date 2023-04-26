package br.edu.ifms.loja.model;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Data;

@Data
@javax.persistence.Entity
public class Produto {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "Código do Produto")
    private long idProduto;
}
