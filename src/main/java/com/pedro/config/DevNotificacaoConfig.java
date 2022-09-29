package com.pedro.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.pedro.dto.Notificacao;

@Component
@Profile("!prod")
public class DevNotificacaoConfig implements Notificacao {

	@Override
	public boolean envioAtivo() {
		return false;
	}

}
