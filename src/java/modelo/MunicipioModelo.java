/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Yuri Domingos
 * Data    : 07 - 01 - 2022
 * Objectivo :Construir o municipio modelo 
 */
public class MunicipioModelo 
{
   private int pk_municipio, fk_provincia;
   private String  descricao;

    public MunicipioModelo() {
    }

    public MunicipioModelo(int pk_municipio, int fk_provincia, String descricao) {
        this.pk_municipio = pk_municipio;
        this.fk_provincia = fk_provincia;
        this.descricao = descricao;
    }

    public int getPk_municipio() {
        return pk_municipio;
    }

    public void setPk_municipio(int pk_municipio) {
        this.pk_municipio = pk_municipio;
    }

    public int getFk_provincia() {
        return fk_provincia;
    }

    public void setFk_provincia(int fk_provincia) {
        this.fk_provincia = fk_provincia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
   
    
}
