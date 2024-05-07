package br.com.aolindo.controller;

import br.com.aolindo.model.Iphone;

public class AplicacaoTelefone {

	public static void main(String[] args) {
		Iphone meuiPhone = new Iphone();

		// ReprodutorMusical
		meuiPhone.selecionarMusica("O tempo nao para - Cazuza");
		meuiPhone.tocar();
		meuiPhone.pausar();

		// AparelhoTelefonico
		meuiPhone.ligar("123456789");
		meuiPhone.atender();
		meuiPhone.iniciarCorreioVoz();

		// NavegadorInternet
		meuiPhone.exibirPagina("https://www.dio.me/");
		meuiPhone.adicionarNovaAba("https://www.youtube.com/");
		meuiPhone.atualizarPagina();
	}

}
