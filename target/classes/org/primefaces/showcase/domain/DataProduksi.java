/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.primefaces.showcase.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author tutnatha
 */
public class DataProduksi implements Serializable{
    private Integer noProduksi;
    private Date tglProduksi;
    private String jenisProduk;
    private int jmlProduk;
    private String idUser;
    private int batchNo;
    
    public DataProduksi() {
    }

        public Integer getNoProduksi() {
        return noProduksi;
    }

    public void setNoProduksi(Integer noProduksi) {
        this.noProduksi = noProduksi;
    }

    public Date getTglProduksi() {
        return tglProduksi;
    }

    public void setTglProduksi(Date tglProduksi) {
        this.tglProduksi = tglProduksi;
    }

    public String getJenisProduk() {
        return jenisProduk;
    }

    public void setJenisProduk(String jenisProduk) {
        this.jenisProduk = jenisProduk;
    }

    public int getJmlProduk() {
        return jmlProduk;
    }

    public void setJmlProduk(int jmlProduk) {
        this.jmlProduk = jmlProduk;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

}
