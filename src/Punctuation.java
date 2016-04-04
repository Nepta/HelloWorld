public enum Punctuation{
	Space(" ");

	private String symbol;

	Punctuation(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return this.symbol;
	}
}
