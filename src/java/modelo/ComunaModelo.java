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
 * Objectivo : Construir a comuna modelo 
 */
public class ComunaModelo {
    
    private int pk_comuna, pk_municipio;
    private String descricao;

    public ComunaModelo() {
    }

    public ComunaModelo(int pk_comuna, int pk_municipio, String descricao) {
        this.pk_comuna = pk_comuna;
        this.pk_municipio = pk_municipio;
        this.descricao = descricao;
    }

    public int getPk_comuna() {
        return pk_comuna;
    }

    public void setPk_comuna(int pk_comuna) {
        this.pk_comuna = pk_comuna;
    }

    public int getPk_municipio() {
        return pk_municipio;
    }

    public void setPk_municipio(int pk_municipio) {
        this.pk_municipio = pk_municipio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
