package com.company.Football.Test;

import com.company.Football.FootBallTeam;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class FootBallTeamTest {
    private final static int THREE_GAMES_WON =3;

    @Test
    public void ConstructorShouldSetGameWon(){
        FootBallTeam footBallTeam=new FootBallTeam(THREE_GAMES_WON);
        assertEquals(THREE_GAMES_WON +" games passed through constructor" +
                "but "+footBallTeam.getGameWon()+" were returned.",THREE_GAMES_WON,footBallTeam.getGameWon());
    }
}
