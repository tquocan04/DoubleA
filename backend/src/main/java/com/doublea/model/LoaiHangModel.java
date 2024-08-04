package com.doublea.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.Column;

@Entity
@Table(name = "loaihang")
public class LoaiHangModel {
	@Id
	@Column(length = 10) 
	private String maLH;
	
	@Column
	private String tenLH;
	
	// getters vs setters
    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String id) {
        this.maLH = id;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String name) {
        this.tenLH = name;
    }

}
