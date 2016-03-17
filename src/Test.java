class Test{
	public static void main(String args[]){
      Printer<HumanString> p = new HumanStringPrinter();
		Sentence helloWorld = new Sentence();
		helloWorld.addWord(new Word("hello")).addWord(new Word("word"));
		p.println(helloWorld);
	}
}
