
public class TestFactory {

	public static void main(String[] args) {
		Document fact= new Document();
		
		InterfataDocument intf = Document.creareDocument(TipDocument.HTML, "factory");
		

		InterfataDocument intf2 = Document.creareDocument(TipDocument.HTML, "fact.html");
		
		System.out.println("Tip document fat1 "+ intf.getTip());
		System.out.println("Tip document fat1 "+ intf2.getTip());
	}

}
