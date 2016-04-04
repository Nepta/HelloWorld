public enum Dictionary{
	HELLO("hello"),
	WORLD("world");

	private String word;

	Dictionary(String word){
		this.word = word;
	}

	public String getWord(){
		return this.word;
	}
}
