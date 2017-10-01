package com.eteration.graphql;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class VoteRepository {

	private List<Vote> votes = new ArrayList<>();

	public List<Vote> findByUserId(String userId) {
		List<Vote> list = new ArrayList<>();
		for (Vote vote : votes) {
			if (vote.getId().equals(userId)) {
				list.add(vote);
			}
		}
		return list;
	}

	public List<Vote> findByLinkId(String linkId) {
		List<Vote> list = new ArrayList<>();
		for (Vote vote : votes) {
			if (vote.getLinkId().equals(linkId)) {
				list.add(vote);
			}
		}
		return list;
	}

	public Vote saveVote(Vote vote) {
		Vote v = new Vote(UUID.randomUUID().toString(), vote.getCreatedAt(), vote.getUserId(), vote.getLinkId());
		votes.add(v);
		return v;

	}

}