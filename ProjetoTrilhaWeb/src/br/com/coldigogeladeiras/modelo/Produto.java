package br.com.coldigogeladeiras.modelo;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String categoria;
	
	private int marcaId;
	
	private String modelo;
	
	private int capacidade;
	
	private float valor;
	
	public Produto() {
		super();
	}
	
	public Produto(int id, String categoria, int marcaId, String modelo, int capacidade, float valor) {
		super();
		
		this.id = id;
		this.categoria = categoria;
		this.marcaId = marcaId;
		this.modelo = modelo;
		this.capacidade = capacidade;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getMarcaId() {
		return marcaId;
	}

	public void setMarcaId(int marcaId) {
		this.marcaId = marcaId;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
