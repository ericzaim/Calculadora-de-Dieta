package calculadorakcal;

import javax.swing.JOptionPane;

public class Pessoa {
	private double Fa;
	public double peso,altura,tmb,d;//d=dieta
	public int gen,fa,idade,obj; //gen{0=homem 1=mulher}

public Pessoa() {
}
/**
 * @return taxa metabólica basal 
 */
public double TMB() {
	if(gen==0) {
		//define a taxa de atividade física diárias do indivíduo
		switch (fa) {
    case 0:
     Fa = 1.2;
        break;
    case 1:
  	  Fa = 1.375;
  	  break;
    case 2:
  	  Fa = 1.55;
  	  break;
    case 3:
  	  Fa = 1.725;
  	  break;
    case 4:
    	Fa = 1.9;
  	  break;
}
	tmb = Fa*(66+((13.7*peso)+(5*(10*altura))-(6.8*idade)));//calcula a tmb para homens
	}else if(gen==1){
	tmb = Fa*(655+((9.6*peso)+(1.8*(10*altura))-(4.7*idade)));//calcula a tmb para mulheres
		}
	return tmb;
	}
/**
 * método para determinar qnt de calorias para a pessoa de acordo com o objetivo dela
 */
	public void Dieta(){
		switch(obj) {
		case 0:
			d = tmb-600;
			break;
		case 1:
			d = tmb;
			break;
		case 2:
			d = tmb+800;
			break;
		}
		JOptionPane.showMessageDialog(null, "Então seu consumo de kcal/dia deve ser de: "+ d +" kcal/dia", "Nova Dieta", 1);
	}
}