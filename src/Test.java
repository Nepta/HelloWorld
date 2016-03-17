class Test{
	public static void main(String args[]){
      Printer<String> p = new StringPrinter();
		Sentence helloWorld = new Sentence();
		helloWorld.addWord(new Word("hello")).addWord(new Word("word"));
		p.println(helloWorld.toString());
	}
}
