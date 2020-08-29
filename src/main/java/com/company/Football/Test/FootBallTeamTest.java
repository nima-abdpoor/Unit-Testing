package com.company.Football.Test;

import com.company.Football.FootBallTeam;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class FootBallTeamTest {
    @Test
    public void ConstructorShouldSetGameWon(){
        FootBallTeam footBallTeam=new FootBallTeam(3);
        assertEquals("3 games passed through constructor" +
                "but "+footBallTeam.getGameWon()+" were returned.",3,footBallTeam.getGameWon());
    }
}
