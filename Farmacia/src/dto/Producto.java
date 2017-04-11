/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Familia
 */
public class Producto {
    
    private String codigo_prod;
    private String nombre_prod;
//    private boolean disponible;
    private String descripcion_prod;
    private String fabricante_prod;
    private String tipo_prod;
    private String componentes_prod;
    private String contenido_prod;
    private Integer cantidad_prod;
    private double gramage_prod;
//    private boolean caducido;
//    private Integer informe_stock;
//    private Integer funcionario_id;

    public Producto() {
    }

    public String getCodigo_prod() {
        return codigo_prod;
    }

    public void setCodigo_prod(String codigo_prod) {
        this.codigo_prod = codigo_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

//    public boolean isDisponible() {
//        return disponible;
//    }
//
//    public void setDisponible(boolean disponible) {
//        this.disponible = disponible;
//    }

    public String getDescripcion_prod() {
        return descripcion_prod;
    }

    public void setDescripcion_prod(String descripcion_prod) {
        this.descripcion_prod = descripcion_prod;
    }

    public String getFabricante_prod() {
        return fabricante_prod;
    }

    public void setFabricante_prod(String fabricante_prod) {
        this.fabricante_prod = fabricante_prod;
    }

    public String getTipo_prod() {
        return tipo_prod;
    }

    public void setTipo_prod(String tipo_prod) {
        this.tipo_prod = tipo_prod;
    }

    public String getComponentes_prod() {
        return componentes_prod;
    }

    public void setComponentes_prod(String componentes_prod) {
        this.componentes_prod = componentes_prod;
    }

    public String getContenido_prod() {
        return contenido_prod;
    }

    public void setContenido_prod(String contenido_prod) {
        this.contenido_prod = contenido_prod;
    }

    public Integer getCantidad_prod() {
        return cantidad_prod;
    }

    public void setCantidad_prod(Integer cantidad_prod) {
        this.cantidad_prod = cantidad_prod;
    }

    public double getGramage_prod() {
        return gramage_prod;
    }

    public void setGramage_prod(double gramage_prod) {
        this.gramage_prod = gramage_prod;
    }

//    public boolean isCaducido() {
//        return caducido;
//    }
//
//    public void setCaducido(boolean caducido) {
//        this.caducido = caducido;
//    }
//
//    public Integer getInforme_stock() {
//        return informe_stock;
//    }
//
//    public void setInforme_stock(Integer informe_stock) {
//        this.informe_stock = informe_stock;
//    }
//
//    public Integer getFuncionario_id() {
//        return funcionario_id;
//    }
//
//    public void setFuncionario_id(Integer funcionario_id) {
//        this.funcionario_id = funcionario_id;
//    }

//    @Override
//    public String toString() {
//        return "Producto{" + "codigo_prod=" + codigo_prod + ", nombre_prod=" + nombre_prod + ", disponible=" + disponible + ", descripcion_prod=" + descripcion_prod + ", fabricante_prod=" + fabricante_prod + ", tipo_prod=" + tipo_prod + ", componentes_prod=" + componentes_prod + ", contenido_prod=" + contenido_prod + ", cantidad_prod=" + cantidad_prod + ", gramage_prod=" + gramage_prod + ", caducido=" + caducido + ", informe_stock_id_informe=" + informe_stock + ", funcionario_id_funcionario=" + funcionario_id + '}';
//    }

    @Override
    public String toString() {
        return "Producto{" + "codigo_prod=" + codigo_prod + ", nombre_prod=" + nombre_prod + ", descripcion_prod=" + descripcion_prod + ", fabricante_prod=" + fabricante_prod + ", tipo_prod=" + tipo_prod + ", componentes_prod=" + componentes_prod + ", contenido_prod=" + contenido_prod + ", cantidad_prod=" + cantidad_prod + ", gramage_prod=" + gramage_prod + '}';
    }
    
    
    
    
}
