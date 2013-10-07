package de.timherbst.statusserver.api;

import java.util.List;

import de.timherbst.statusserver.model.Property;
import de.timherbst.statusserver.model.StatusMessage;

public interface StatusMessageTask {

	public List<StatusMessage> getStatusMessages(List<Property> properties);

	public StatusMessageTask setKunde(String kunde);
	public String getKunde();
	public StatusMessageTask setBereich(String bereich);
	public String getBereich();

}
