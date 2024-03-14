package com.relacao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item_venda")
public class ItemVenda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_produto",nullable = false)
	private Produto produto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_vendas",nullable = false)
	private Vendas vendas;
}
