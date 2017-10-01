package com.eteration.graphql;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinkRepository {
    
    private final Map<String,Link> links;

    public LinkRepository() {
        links = new HashMap<>();
        //add some links to start off with
        links.put("1",new Link("1","http://howtographql.com", "Your favorite GraphQL page"));
        links.put("2",new Link("2","http://graphql.org/learn/", "The official docks"));
    }

    public List<Link> getAllLinks() {
		return   new ArrayList<>(links.values());
    }
    
    public void saveLink(Link link) {
        links.put(link.getId(),link);
    }

	public Link findById(String id) {
		return links.get(id);
	}
}