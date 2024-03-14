package com.relacao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vendas")
public class Vendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vendas", nullable = false)
	private Long id;
	
	@Column(name = "data_venda", nullable = false, length = 100)
	private String data_venda;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente",nullable = false)
	private Cliente cliente;
	
	
}
