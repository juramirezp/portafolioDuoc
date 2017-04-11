/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conex.Conexion;
import dto.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Familia
 */
public class ProductoDao implements BaseDao {

    @Override
    public boolean ingresar(Producto dto) {
        try {
            Connection conexion = Conexion.getConexion();
            String query = "INSERT INTO producto(codigo_prod,nombre_prod,"
                    + "descripcion_prod,fabricante_prod,"
                    + "tipo_prod,componentes_prod,contenido_prod,"
                    + "cantidad_prod,gramage_prod)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement insertar = conexion.prepareStatement(query);
            insertar.setString(1, dto.getCodigo_prod());
            insertar.setString(2, dto.getNombre_prod());
//            insertar.setBoolean(3, dto.isDisponible());
            insertar.setString(3, dto.getDescripcion_prod());
            insertar.setString(4, dto.getFabricante_prod());
            insertar.setString(5, dto.getTipo_prod());
            insertar.setString(6, dto.getComponentes_prod());
            insertar.setString(7, dto.getContenido_prod());
            insertar.setInt(8, dto.getCantidad_prod());
            insertar.setDouble(9, dto.getGramage_prod());
//            insertar.setBoolean(11, dto.isCaducido());
//            insertar.setInt(12, dto.getInforme_stock());
//            insertar.setInt(13, dto.getFuncionario_id());
            insertar.execute();
            insertar.close();
            conexion.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error Sql al Insertar : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al insertar : " + e.getMessage());
        }
        return false;
    }

//    @Override
//    public boolean modificar(Producto dto) {
//        try {
//            Connection conexion = Conexion.getConexion();
//            String query = "UPDATE Cliente SET codigo_prod=?,nombre_prod=?"
//                    + "disponible=?,descripcion_prod=?,fabricante_prod=?,"
//                    + "tipo_prod=?,componentes_prod=?,contenido_prod=?"
//                    + "cantidad_prod=?,gramage_prod=?,Caducido=?"
//                    + "informe_stock_id_informe=?,Funcionario_id_funcionario=?"
//                    + "WHERE codigo_prod=?";
//            PreparedStatement buscar = conexion.prepareStatement(query);
//            buscar.setString(1, dto.getCodigo_prod());
//            buscar.setString(2, dto.getNombre_prod());
//            buscar.setBoolean(3, dto.isDisponible());
//            buscar.setString(4, dto.getDescripcion_prod());
//            buscar.setString(5, dto.getFabricante_prod());
//            buscar.setString(6, dto.getTipo_prod());
//            buscar.setString(7, dto.getComponentes_prod());
//            buscar.setString(8, dto.getContenido_prod());
//            buscar.setInt(9, dto.getCantidad_prod());
//            buscar.setDouble(10, dto.getGramage_prod());
//            buscar.setBoolean(11, dto.isCaducido());
//            buscar.setInt(12, dto.getInforme_stock());
//            buscar.setInt(13, dto.getFuncionario_id());
//            buscar.executeUpdate();
//            buscar.close();
//            conexion.close();
//
//            return true;
//        } catch (SQLException w) {
//            System.out.println("Error SQL al "
//                    + " modificar " + w.getMessage());
//            return false;
//        } catch (Exception e) {
//            System.out.println("Error al "
//                    + " modificar " + e.getMessage());
//            return false;
//        }
//    }

//    @Override
//    public ArrayList<Producto> buscarPorCodigo(String codigo) {
//        ArrayList<Producto> lista = new ArrayList<Producto>();
//        try{
//            Connection conexion = Conexion.getConexion();
//            String query = "SELECT * FROM producto WHERE codigo_prod=?";
//
//            PreparedStatement buscar=conexion.prepareStatement(query);
//            buscar.setString(1, codigo);
//            ResultSet rs = buscar.executeQuery();
//            while (rs.next()){
//                Producto dto= new Producto();               
//                dto.setCodigo_prod(rs.getString("codigo_prod"));
//                dto.setNombre_prod(rs.getString("nombre_prod"));
////                dto.setDisponible(rs.getBoolean("disponible"));
//                dto.setDescripcion_prod(rs.getString("descripcion_prod"));
//                dto.setFabricante_prod(rs.getString("fabricante_prod"));
//                dto.setTipo_prod(rs.getString("tipo_prod"));
//                dto.setComponentes_prod(rs.getString("componentes_prod"));
//                dto.setContenido_prod(rs.getString("contenido_prod"));
//                dto.setCantidad_prod(rs.getInt("cantidad_prod"));
//                dto.setGramage_prod(rs.getDouble("gramaje_prod"));
////                dto.setCaducido(rs.getBoolean("caducido"));
////                dto.setInforme_stock(rs.getInt("informe_stock_id_informe"));
////                dto.setFuncionario_id(rs.getInt("Funcionario_id_funcionario"));
//                
//               lista.add(dto);
//                
//            }
//        }catch(SQLException w){
//            System.out.println("Error SQL al buscar por codigo"+w.getMessage());
//        }catch(Exception e){
//            System.out.println("Error al buscar por codigo"+e.getMessage());
//        }
//        return lista;
//    }

//    @Override
//    public ArrayList<Producto> buscarPorNombre(String nombre) {
//        ArrayList<Producto> lista = new ArrayList<Producto>();
//        try{
//            Connection conexion = Conexion.getConexion();
//            String query = "SELECT * FROM producto WHERE nombre=?";
//
//            PreparedStatement buscar=conexion.prepareStatement(query);
//            buscar.setString(1, nombre);
//            ResultSet rs = buscar.executeQuery();
//            while (rs.next()){
//                Producto dto= new Producto();               
//                dto.setCodigo_prod(rs.getString("codigo_prod"));
//                dto.setNombre_prod(rs.getString("nombre_prod"));
//                dto.setDisponible(rs.getBoolean("disponible"));
//                dto.setDescripcion_prod(rs.getString("descripcion_prod"));
//                dto.setFabricante_prod(rs.getString("fabricante_prod"));
//                dto.setTipo_prod(rs.getString("tipo_prod"));
//                dto.setComponentes_prod(rs.getString("componentes_prod"));
//                dto.setContenido_prod(rs.getString("contenido_prod"));
//                dto.setCantidad_prod(rs.getInt("cantidad_prod"));
//                dto.setGramage_prod(rs.getDouble("gramaje_prod"));
//                dto.setCaducido(rs.getBoolean("caducido"));
//                dto.setInforme_stock(rs.getInt("informe_stock_id_informe"));
//                dto.setFuncionario_id(rs.getInt("Funcionario_id_funcionario"));
//                
//               lista.add(dto);
//                
//            }
//        }catch(SQLException w){
//            System.out.println("Error SQL al buscar por nombre"+w.getMessage());
//        }catch(Exception e){
//            System.out.println("Error al buscar por nombre"+e.getMessage());
//        }
//        return lista;
//    }
    
    
    
    public ArrayList<Producto> listarTodosLosProductos() {
        ArrayList<Producto> lista = null;
        try {
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM producto";
            PreparedStatement buscar = conexion.prepareStatement(query);
            ResultSet rs = buscar.executeQuery();
            
                lista = new ArrayList<Producto>();
                while (rs.next()) {
                    Producto dto = new Producto();
                    
                    dto.setCodigo_prod(rs.getString("codigo_prod"));
                    dto.setNombre_prod(rs.getString("nombre_prod"));
                    dto.setDescripcion_prod(rs.getString("descripcion_prod"));
                    dto.setFabricante_prod(rs.getString("fabricante_prod"));
                    dto.setTipo_prod(rs.getString("tipo_prod"));
                    dto.setComponentes_prod(rs.getString("componentes_prod"));
                    dto.setContenido_prod(rs.getString("contenido_prod"));
                    dto.setCantidad_prod(rs.getInt("cantidad_prod"));
                    dto.setGramage_prod(rs.getDouble("gramage_prod"));
                    lista.add(dto);
                }
            
            buscar.close();
            conexion.close();
        } catch (SQLException w) {
            System.out.println("Error SQL al buscar " + w.getMessage());
        } catch (Exception e) {
            System.out.println("Error al buscar " + e.getMessage());
        }
        return lista;
    }
    

}
