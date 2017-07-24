package bnm;

import java.math.BigDecimal;

public class Leu {
	private BigDecimal usd,eur,uah,ron,rub;

	public Leu(BigDecimal usd, BigDecimal eur, BigDecimal uah, BigDecimal ron, BigDecimal rub) {
		super();
		this.usd = usd;
		this.eur = eur;
		this.uah = uah;
		this.ron = ron;
		this.rub = rub;
	}
	public Leu(){
		
	}

	public void setUsd(BigDecimal usd) {
		this.usd = usd;
	}
	public void setEur(BigDecimal eur) {
		this.eur = eur;
	}
	public void setUah(BigDecimal uah) {
		this.uah = uah;
	}
	public void setRon(BigDecimal ron) {
		this.ron = ron;
	}
	public void setRub(BigDecimal rub) {
		this.rub = rub;
	}
	public BigDecimal getUsd() {
		return usd;
	}

	public BigDecimal getEur() {
		return eur;
	}

	public BigDecimal getUah() {
		return uah;
	}

	public BigDecimal getRon() {
		return ron;
	}

	public BigDecimal getRub() {
		return rub;
	}
	@Override
	public String toString() {
		return "Leu [usd=" + usd + ", eur=" + eur + ", uah=" + uah + ", ron=" + ron + ", rub=" + rub + "]";
	}
	
	
}
