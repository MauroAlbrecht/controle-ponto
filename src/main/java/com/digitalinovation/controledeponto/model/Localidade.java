package com.digitalinovation.controledeponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade implements Serializable {

    @Id
    private  long id;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    private String descricao;
}
