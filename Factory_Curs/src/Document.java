
public class Document {

	public static InterfataDocument creareDocument(TipDocument tip,String titlu) {
		InterfataDocument document = null;
		switch(tip) {
		case TEXT:
			document = new DocumentText();
			document.setTitlu(titlu);
			break;
		case HTML:
			document = new DocumentHtml(titlu);
			break;
			default:
				throw new UnsupportedOperationException();
		}
		return document;
	}
}
