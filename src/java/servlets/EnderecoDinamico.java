/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.google.gson.Gson;
import dao.provinciaDAO;
import java.io.IOException;
import java.lang.Thread.State;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.ComunaModelo;
import modelo.MunicipioModelo;
import modelo.ProvinciaModelo;

/**
 *
 * @author yuri
 */
@WebServlet(name = "EnderecoDinamico", urlPatterns = {"/EnderecoDinamico"})
public class EnderecoDinamico extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
            provinciaDAO tmp_lista = new provinciaDAO();
            String op = request.getParameter("operation");
            
            if (op.equals("provincia")) 
            
            {
                System.out.println("Entrei no teste yurri ");
                List<ProvinciaModelo> listaProvinciaTmp = tmp_lista.listar_todas_provincias();
                
                Gson json = new Gson();
                
                String lista_provincia = json.toJson(listaProvinciaTmp);  
                response.setContentType("text/html");
                response.getWriter().write(lista_provincia);
            }

            if (op.equals("municipio"))
            {
                int id = Integer.parseInt(request.getParameter("id"));
                
                List<MunicipioModelo> lista_municipios = tmp_lista.listar_todos_municipio_pelo_id_provincia(id);
                Gson json = new Gson();
                String listaMunicipio = json.toJson(lista_municipios);
                response.setContentType("text/html");
                response.getWriter().write(listaMunicipio);
            }

            if (op.equals("comuna")) 
            {
                int id = Integer.parseInt(request.getParameter("id"));
                List<ComunaModelo> lista_comuna = tmp_lista.listar_todas_comunas_pelo_id_municipio(id);
                Gson json = new Gson();
                String listaComuna = json.toJson(lista_comuna);
                response.setContentType("text/html");
                response.getWriter().write(listaComuna);
            }
        
    }

   
   
}
