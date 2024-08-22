package calculadorakcal;

import javax.swing.JOptionPane;

public class Calculadora{

	static String[] genero = { "Homem","Mulher" };
	static String[] atividade= {"Sedentário","Levemente Ativo","Moderadamente Ativo","Altamente Ativo","Extremamente Ativo"};
	static String[] tabela= {"Sedentário - 0 dias\n\nLevemente Ativo - 1 a 3 dias\n\nModeradamente Ativo - 3 a 5 dias\n\nAltamente Ativo - 5 a 6 dias\n\nExtremamente Ativo - diariamente até 2x por dia"};
	static String[] obj = {"Perder Peso","Manter Peso","Ganhar Peso"};
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.gen = JOptionPane.showOptionDialog(null,"Gênero","Qual seu gênero?", 0, 3, null, genero, genero[0]);
		p.fa = JOptionPane.showOptionDialog(null,tabela[0], "Prática de Atividade Física",0, 3, null, atividade,atividade[0]);
		p.altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura(m)?"));
		p.idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		p.peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso atual?"));
	    p.TMB();
	    JOptionPane.showMessageDialog(null, "Taxa Metabolica Basal: "+p.tmb+" kcal/dia", "Resultado", 1);
		System.out.printf("Taxa Metabolica Basal: "+p.tmb+" kcal/dia");
		p.obj = JOptionPane.showOptionDialog(null, "Qual seu Objetivo?", "Objetivo", 0,3, null, obj, obj[0]);
		System.out.println(p.d);
		p.Dieta();
	}
}
