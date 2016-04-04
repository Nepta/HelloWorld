class Word implements HumanString{
	private String word;

	Word(String word){
		this.word = word;
	}

	Word(Dictionary dictionaryWord){
		this.word = dictionaryWord.getWord();
	}

	@Override
	public String toHumanString(){
		return word;
	}
}
