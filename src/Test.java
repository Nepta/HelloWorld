class Test{
	public static void main(String args[]){
      Printer<String> p = new StringPrinter();
		Sentence helloWorld = new Sentence();
		helloWorld.addWord("hello").addWord("word");
		p.println(helloWorld.toString());
	}
}
