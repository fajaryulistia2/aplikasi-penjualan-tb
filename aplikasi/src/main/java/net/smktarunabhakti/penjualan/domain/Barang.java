package net.smktarunabhakti.penjualan.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="m_barang")
public class Barang implements Serializable{
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String id;
	
	@NotNull
	@Column(name="kode_barang", nullable=false, length=5)
	private String kodeBarang;
	
	@Column(name="nama_barang", nullable=false)
	private String namaBarang;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKodeBarang() {
		return kodeBarang;
	}
	public void setKodeBarang(String kodeBarang) {
		this.kodeBarang = kodeBarang;
	}
	public String getNamaBarang() {
		return namaBarang;
	}
	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

}
