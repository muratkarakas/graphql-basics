package com.eteration.graphql;
public class Link {
    
	private final String id;
    private final String url;
    private final String description;

  

    public Link(String id, String url, String description) {
		super();
		this.id = id;
		this.url = url;
		this.description = description;
	}

	public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

	public String getId() {
		return id;
	}
}