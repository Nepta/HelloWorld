class Test{
	public static void main(String args[]){
      Printer<HumanString> p = new HumanStringPrinter();
		Sentence helloWorld = new Sentence();
		helloWorld.addWord(new Word(Dictionary.Hello)).addWord(new Word(Dictionary.World));
		p.println(helloWorld);
	}
}
