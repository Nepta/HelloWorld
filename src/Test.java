class Test{
	public static void main(String args[]){
      Printer<HumanString> p = new HumanStringPrinter();
		Sentence helloWorld = new Sentence();
		helloWorld.addWord(new Word(Dictionary.HELLO)).addWord(new Word(Dictionary.WORLD));
		p.println(helloWorld);
	}
}
