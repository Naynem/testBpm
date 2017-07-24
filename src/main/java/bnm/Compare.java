package bnm;

public class Compare {
	private Leu seleu,soleu;
	
	
	public void setSeleu(Leu seleu) {
		this.seleu = seleu;
	}


	public void setSoleu(Leu soleu) {
		this.soleu = soleu;
	}


	public Leu getSeleu() {
		return seleu;
	}


	public Leu getSoleu() {
		return soleu;
	}


	public boolean compare(){
		if(seleu != null && soleu != null){
			boolean c=true;
			if(seleu.getEur().compareTo(soleu.getEur()) == 0){System.out.println(" Compare Eur: "+true);}else c=false;
			if(seleu.getUsd().compareTo(soleu.getUsd()) == 0){System.out.println(" Compare Usd: "+true);}else c=false;
			if(seleu.getRon().compareTo(soleu.getRon()) == 0){System.out.println(" Compare Ron: "+true);}else c=false;
			if(seleu.getUah().compareTo(soleu.getUah()) == 0){System.out.println(" Compare Uah: "+true);}else c=false;
			if(seleu.getRub().compareTo(soleu.getRub()) == 0){System.out.println(" Compare Rub: "+true);}else c=false;
			return c;
			
		}
		return false;
	}
}
