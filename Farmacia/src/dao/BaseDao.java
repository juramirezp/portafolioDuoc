/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Producto;
import java.util.ArrayList;

/**
 *
 * @author Familia
 */
public interface BaseDao {
   
    public boolean ingresar(Producto dto);
//    public boolean modificar(Producto dto);
//    public ArrayList<Producto>buscarPorCodigo(String codigo);
//    public ArrayList<Producto>buscarPorNombre(String nombre);
}
