package com.eteration.graphql;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Mutation implements GraphQLRootResolver {

	private final LinkRepository linkRepository;
	private final VoteRepository voteRepository;

	public Mutation(LinkRepository linkRepository, VoteRepository voteRepository) {
		this.linkRepository = linkRepository;
		this.voteRepository = voteRepository;
	}

	public Link createLink(String url, String description) {
		Link newLink = new Link(UUID.randomUUID().toString(), url, description);
		linkRepository.saveLink(newLink);
		return newLink;
	}

	public Vote createVote(String linkId, String userId) {
		ZonedDateTime now = Instant.now().atZone(ZoneOffset.UTC);
		return voteRepository.saveVote(new Vote(now, userId, linkId));
	}
}