package de.timherbst.statusserver.api;

import java.util.List;

import de.timherbst.statusserver.model.Property;
import de.timherbst.statusserver.model.StatusMessage;

public abstract class AbstractStatusMessageTask implements StatusMessageTask {

	private String bereich;
	private String kunde;

	public String getBereich() {
		return bereich;
	}

	public AbstractStatusMessageTask setBereich(String bereich) {
		this.bereich = bereich;
		return this;
	}

	public String getKunde() {
		return kunde;
	}

	public AbstractStatusMessageTask setKunde(String kunde) {
		this.kunde = kunde;
		return this;
	}

	@Override
	public abstract List<StatusMessage> getStatusMessages(
			List<Property> properties);

}
