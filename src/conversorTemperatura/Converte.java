package conversorTemperatura;

public class  Converte{
	
	public double converterPara(double temperatura, char opcao) {
		
		if(opcao == 'F') {
			return ((temperatura * 9) / 5) + 32;
		}else {
			return  ((temperatura - 32) * 5) / 9;
		}
	}

 }
