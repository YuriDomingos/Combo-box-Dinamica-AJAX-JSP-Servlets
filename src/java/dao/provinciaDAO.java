/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ComunaModelo;
import modelo.MunicipioModelo;
import modelo.ProvinciaModelo;
import utils.Conexao;

/**
 *
 * @author Yuri Dmingos
 * Data   : 07 - 01 - 2022
 * Objectivo : Construir a provincia DAO 
 * 
 */
public class provinciaDAO 
{
    
       
    public ArrayList<ProvinciaModelo> listar_todas_provincias()
    {
        
        ArrayList<ProvinciaModelo> listaAdd = new ArrayList<>();
        
        String query1 = "select *from provincia";
        try
        {
            Connection con = Conexao.abrirConexao();
            PreparedStatement ps = con.prepareStatement(query1);
            ResultSet rs = ps.executeQuery();
            
            while( rs.next())
            {
                ProvinciaModelo provincia = new ProvinciaModelo();    
                provincia.setPk_provincia(rs.getInt(1));
                provincia.setDescricao(rs.getString(2));
                listaAdd.add(provincia);
                
            }
            
        }
        catch(SQLException ex)
        {
            System.out.println("Erro ao ler "+ex.toString());
        }
        
        return listaAdd;
    }
    
    public ArrayList<MunicipioModelo> listar_todos_municipio_pelo_id_provincia(int provinciaID)
    {
        
        ArrayList<MunicipioModelo> listaAdd = new ArrayList<>();
        
        String query1 = "SELECT * FROM municipio where fk_provincia = ?";
        
        try
        {
            Connection con = Conexao.abrirConexao();
            PreparedStatement ps = con.prepareStatement(query1);
            ps.setInt(1, provinciaID);
            ResultSet rs = ps.executeQuery();
            
            while( rs.next())
            {  
                MunicipioModelo municipioModelo = new MunicipioModelo();
                
                municipioModelo.setPk_municipio(rs.getInt(1));
                municipioModelo.setDescricao(rs.getString(2));
                municipioModelo.setFk_provincia(rs.getInt(3));
                listaAdd.add(municipioModelo);
                
            }
            
        }
        catch(SQLException ex)
        {
            System.out.println(" Erro os municípios "+ex.toString());
        }
        
        return listaAdd;
    }
    
    public ArrayList<ComunaModelo> listar_todas_comunas_pelo_id_municipio(int id_municipio)
    {
         ArrayList<MunicipioModelo> listaAdd = new ArrayList<>();
         
         String query = "SELECT *FROM comuna where fk_municipio = ?";
         
         try
         {
             Connection con = Conexao.abrirConexao();
             PreparedStatement ps = con.prepareStatement(query);
             ps.setInt(1, id_municipio);
             ResultSet rs = ps.executeQuery();
             
             while ( rs.next())
             {
                 
                 ComunaModelo comunuaModelo = new ComunaModelo();
                 comunuaModelo.setPk_comuna(rs.getInt(1));
                 comunuaModelo.setDescricao(rs.getString(2));
                 comunuaModelo.set
             }
                     
             
         }
         catch(SQLException ex)
         {
             System.out.println("Erro ao listar os municipio "+ex.toString());
         }
        
    }
    
    
    
    
    
    
    
}
