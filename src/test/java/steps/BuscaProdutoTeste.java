package steps;


import elementos.Elementos;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import metodos.Metodos;
import runner.Executa;

public class BuscaProdutoTeste {
	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	public void iniciarTeste() {
		Executa.abrirNavegador();
	}

	public void finalizarTeste() {
		Executa.fecharNavegador();

	}

	@Dado("clicar na barra de pesquisa")
	public void clicarNaBarraDePesquisa() {

		metodos.clicar(el.barraPesquisa);

	}

	@Dado("informar o produto desejado")
	public void informarOProdutoDesejado() {

		metodos.escrever(el.produto, "maquiagem");

	}

	@Quando("pressionar enter")
	public void pressionarEnter() {

		metodos.submit(el.btnEnter);
	
	}

	@Entao("sistema traz produto pesquisado")
	public void sistemaTrazProdutoPesquisado() {

		metodos.tirarPrint("CT01a - Validar mensagem");

	}

	@Dado("informe {string} na barra de pesquisa")
	public void informeNaBarraDePesquisa(String string) {
		metodos.escrever(el.prodInvalido, "sapato");

	}

	@Quando("clicar na lupa pesquisar")
	public void clicarNaLupaPesquisar() {
		metodos.submit(el.btnEnter);
		
	}

	@Entao("sistema emite mensagem {string}")
	public void sistemaEmiteMensagem(String string) {
		metodos.tirarPrint("CT02 - Validar mensagem");
	}
	



}
