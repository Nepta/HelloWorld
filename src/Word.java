class Word implements HumanString{
	private String word;

	Word(String word){
		this.word = word;
	}

	@Override
	public String toHumanString(){
		return word;
	}
}
