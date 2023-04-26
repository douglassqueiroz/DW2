package ifms.edu.br.lp2.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
@javax.persistence.Entity
public class Coordenador {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiParam(value = "Código do Coordenador")
    private long idCoordenador;

    @ApiModelProperty(value = "Nome do Coordenador")
    @Column()
    private String nome;
    
    @javax.validation.constraints.NotBlank(message = "O campo do CPF não pode ser em branco")
    @ApiModelProperty(value = "insira o CPF")
    @Column()
    private String cpf;
    public String getNome(){
    return nome;
    }

    public void setNome(String newNome){
        this.nome = newNome;
    }

}
