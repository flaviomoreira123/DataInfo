import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private char nome;
	private int unidade;   
	private int quantidade;
	private int codigo;
	private double preco;
	private static List<Produto> cadastraProduto = new ArrayList<Produto>();
	
	public char getNome() {
		return nome;
	}
	public static List<Produto> getCadastraProduto() {
		return cadastraProduto;
	}
	public static void setCadastraProduto(List<Produto> cadastraProduto) {
		Estoque.cadastraProduto = cadastraProduto;
	}
	public void setNome(char nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
}
