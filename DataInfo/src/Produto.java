import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Produto extends JFrame{
	private List<Produto> cadastraProduto = new ArrayList<Produto>();
	private JLabel lblProduto, lblCodigo, lblQuantidade, lblPreco, lblDescricao, lblVazio;
	private JTextField txtProduto, txtCodigo, txtQuantidade, txtPreco, txtDescricao;
	private JButton btnSalvar;
	private JPanel painel;
	
	public Produto(String titulo) {
		super(titulo);
		lblProduto = new JLabel("Produto: ");
		lblCodigo = new JLabel("Código: ");
		lblQuantidade = new JLabel("Quantidade: ");
		lblPreco = new JLabel("Preço: ");
		lblDescricao = new JLabel("Descrição: ");
		lblVazio = new JLabel(" ");
		txtProduto = new JTextField(40);
		txtCodigo = new JTextField(20);
		txtQuantidade = new JTextField(40);
		txtPreco = new JTextField(20);
		txtDescricao = new JTextField(40);
		
		btnSalvar = new JButton("Salvar cadastro");
		
		painel = new JPanel();
		painel.setLayout(new GridLayout(6,2));
		painel.add(lblProduto);
		painel.add(txtProduto);
		painel.add(lblCodigo);
		painel.add(txtCodigo);
		painel.add(lblDescricao);
		painel.add(txtDescricao);
		painel.add(lblQuantidade);
		painel.add(txtQuantidade);
		painel.add(lblPreco);
		painel.add(txtPreco);
		painel.add(lblVazio  );
		
		painel.add(btnSalvar);
		
		this.getContentPane().add(painel);;
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.pack();
		this.setLocation(100, 100);
		this.setVisible(true);
	}
	
}
