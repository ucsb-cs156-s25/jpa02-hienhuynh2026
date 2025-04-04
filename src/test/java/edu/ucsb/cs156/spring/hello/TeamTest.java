package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
    
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equal_returns_true_for_equal_teams() {
        Team team2 = new Team("test-team");
        assertEquals(team, team2);
    }

    @Test
    public void equal_returns_false_for_different_teams() {
        Team team2 = new Team("test-team2");
        assert(!team.equals(team2));
    }

    @Test
    public void equal_returns_false_for_different_object() {
        assert(!team.equals(new Object()));
    }

    @Test
    public void equal_returns_true_for_same_object() {
        assert(team.equals(team));
    }
    @Test
    public void equal_returns_false_for_null() {
        assert(!team.equals(null));
    }
    @Test
    public void equal_returns_false_for_different_team() {
        Team team2 = new Team("test-team");
        team2.addMember("test-member");
        assert(!team.equals(team2));
    }
    @Test
    public void equal_returns_true_for_same_team() {
        Team team2 = new Team("test-team");
        assert(team.equals(team2));
    }
    @Test
    public void hashCodetest() {
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
            

    
   

        

    }
    

    



    



    

    

    
    

}
