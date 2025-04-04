package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/

        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();

        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");


        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
       
        assertEquals("Hien H.", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void getGithubId_returns_correct_githubId() {
       
        assertEquals("hienhuynh2026", Developer.getGithubId());
        
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team team = Developer.getTeam();
        assertEquals("s25-05", team.getName());
        assertEquals(6, team.getMembers().size());
        assertTrue(team.getMembers().contains("Hien H."), "Team should contain Hien H.");
        assertTrue(team.getMembers().contains("Austin Q."), "Team should contain Austin Qu.");
        assertTrue(team.getMembers().contains("Michael T."), "Team should contain Michael T.");
        assertTrue(team.getMembers().contains("Jim W."), "Team should contain Jim W.");
        assertTrue(team.getMembers().contains("Awin Z."), "Team should contain Awin Z.");
        assertTrue(team.getMembers().contains("Vishal S."), "Team should contain Vishal S.");




    }

    


}
