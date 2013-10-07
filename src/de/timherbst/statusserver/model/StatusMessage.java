package de.timherbst.statusserver.model;

public class StatusMessage implements Comparable<StatusMessage>{

	MessageType type;
	String bereich;
	String kunde;
	String message;
	
	public StatusMessage() {
		// TODO Auto-generated constructor stub
	}

	public StatusMessage(MessageType type, String bereich, String kunde, String message) {
		super();
		if(type==null || message==null || bereich == null || kunde == null){
			this.type = MessageType.ERROR;
			this.message = "Type, Message, Bereich und Kunde müssen gesetzt werden.";
			this.bereich = "";
			this.kunde = "";
			return;
		}
			
			
		this.type = type;
		this.message = message;
		this.bereich = bereich;
		this.kunde = kunde;
	}

	public MessageType getType() {
		return type;
	}

	public String getMessage() {
		return message;
	}
	
	public String getBereich() {
		return bereich;
	}

	public String getKunde() {
		return kunde;
	}

	public String toHTML() {
		return "<div class=\"item "+type.getHTMLClass()+"\">\n\t<div class=\"kunde\"><a href=\"kunde.jsp?kunde="+kunde+"\">"+kunde+"</a></div>\n\t<div class=\"bereich\">"+bereich+"</div>\n\t<div class=\"message\">"+message+"</div>\n</div>";
	}
	
	public String toString() {
		return type.getHTMLClass()+" "+getBereich()+" "+getKunde()+" "+getMessage();
	}

	@Override
	public int compareTo(StatusMessage o) {
		int sort = type.compareTo(o.getType());
		if (sort == 0)
			sort = kunde.compareTo(o.getKunde());
		if (sort == 0)
			sort = bereich.compareTo(o.getBereich());
		if (sort == 0)
			sort = message.compareTo(o.getMessage());
				
		return sort;
	}

}
