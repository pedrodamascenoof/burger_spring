package com.pedro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pedro.domain.Pedido;
import com.pedro.queue.Producer;



@Component
public class AtualizaEstoque {

	@Autowired
	private Producer producer;
	
	public void processar(Pedido pedido) {
		
		try {
			// atualiza estoque 
			producer.send(pedido);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
