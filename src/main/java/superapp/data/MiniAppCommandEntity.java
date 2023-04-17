package superapp.data;

import java.util.Date;
import java.util.Map;


public class MiniAppCommandEntity {
	private String commandId;
	private String command;
	private String targetObject;
	private Date invocationTimestamp;
	private String invokedBy;
	private Map<String, String> commandAttributes;
	
	
	public MiniAppCommandEntity() {
	}
	public String getCommandId() {
		return commandId;
	}
	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getTargetObject() {
		return targetObject;
	}
	public void setTargetObject(String targetObject) {
		this.targetObject = targetObject;
	}
	public Date getInvocationTimestamp() {
		return invocationTimestamp;
	}
	public void setInvocationTimestamp(Date invocationTimestamp) {
		this.invocationTimestamp = invocationTimestamp;
	}
	public String getInvokedBy() {
		return invokedBy;
	}
	public void setInvokedBy(String invokedBy) {
		this.invokedBy = invokedBy;
	}
	public Map<String, String> getCommandAttributes() {
		return commandAttributes;
	}
	public void setCommandAttributes(Map<String, String> commandAttributes) {
		this.commandAttributes = commandAttributes;
	}
	
	
}
