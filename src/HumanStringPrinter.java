class HumanStringPrinter implements Printer<HumanString>{
	@Override
   public void println(HumanString s){
		System.out.println(s.toHumanString());
	}
}
