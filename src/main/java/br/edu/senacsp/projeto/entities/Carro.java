package br.edu.senacsp.projeto.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name = "Carro")
public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	int id;

	@Column(name = "Fabricante")
	String fabricante;

	@Column(name = "Modelo")
	String modelo;

	@Column(name = "Placa")
	String placa;

	@Column(name = "Cor")
	String cor;

	@Column(name = "Kilometragem")
	double km;

	@Column(name = "Ano")
	int ano;

	@Column(name = "Valor")
	double valor;

	@Column(name = "Descricao")
	String descricao;

	@Column(name = "Disponivel")
	boolean disponivel;

	public Carro(int id, String fabricante, String modelo, String placa, String cor, double km, int ano, double valor,
			String descricao, boolean disponivel) {
		this.id = id;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.ano = ano;
		this.valor = valor;
		this.descricao = descricao;
		this.disponivel = disponivel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", fabricante=" + fabricante + ", modelo=" + modelo + ", placa=" + placa + ", cor="
				+ cor + ", km=" + km + ", ano=" + ano + ", valor=" + valor + ", descricao=" + descricao
				+ ", disponivel=" + disponivel + "]";
	}

}
