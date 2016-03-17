class Test{
	public static void main(String args[]){
      Printer<String> p = new StringPrinter();
		String helloWorld = Constant.HELLOWORLD;
		p.println(helloWorld);
	}
}
