public enum Dictionary{
	Hello("hello"),
	World("world");

	private String word;

	Dictionary(String word){
		this.word = word;
	}

	public String getWord(){
		return this.word;
	}
}
