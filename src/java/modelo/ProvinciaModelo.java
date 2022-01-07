/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Yuri Domingos
 * Data   : 07 - 01 - 2022
 * Objectivo : Construir o modelo da provincia 
 */
public class ProvinciaModelo 
{
    
    private int pk_provincia;
    private String descricao;

    public ProvinciaModelo() {
    }

    public ProvinciaModelo(int pk_provincia, String descricao) {
        this.pk_provincia = pk_provincia;
        this.descricao = descricao;
    }

    public int getPk_provincia() {
        return pk_provincia;
    }

    public void setPk_provincia(int pk_provincia) {
        this.pk_provincia = pk_provincia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
