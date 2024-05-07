package br.com.aolindo.model;

public class Iphone implements ReprodutorMusical, AparelhoEletronico, NavegadorInternet{

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica " + musica);
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina: " + url);
	}

	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("Adicionando nova aba com pagina: " + url);
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina.");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
	}

}
