package com.winterbe.matrix;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

public class GithubCollectorTest {

    @Test
    public void testFetchLatestCommits() throws Exception {
        String personalAccessToken = System.getProperty("personalAccessToken");
        String username = System.getProperty("username");
        GithubCollector repo = new GithubCollector(username, personalAccessToken);
        List<Drop> drops = repo.collect();
        assertThat(drops, not(empty()));
    }

}