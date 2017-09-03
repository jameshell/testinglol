/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sergio.mundo.vo;

import java.sql.Date;

/**
 *
 * @author Jaime Alonso
 */
public class Alquiler {
    
    private int idAlquiler;
    private int cedulaEncargao;
    private int cedulaPersona;
    private Date fechaEntrada;
    private Date fechaSalida;
    private float precio;

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public int getCedulaEncargao() {
        return cedulaEncargao;
    }

    public void setCedulaEncargao(int cedulaEncargao) {
        this.cedulaEncargao = cedulaEncargao;
    }

    public int getCedulaPersona() {
        return cedulaPersona;
    }

    public void setCedulaPersona(int cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
