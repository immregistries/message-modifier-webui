package org.immregistries.message_modifier.webui;

public class ModifyRequest {

    private long id;
    private String script;
    private String content;
    
    public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
