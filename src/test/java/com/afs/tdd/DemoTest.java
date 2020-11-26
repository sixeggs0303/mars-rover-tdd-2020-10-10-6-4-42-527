package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    public void should_return_y_plus_1_when_executeCommands_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String commands = "M";

        //when
        marsRover.executeCommands(commands);

        //then
        assertEquals(1, marsRover.getYLocation());
    }

    @Test
    public void should_0_1_N_when_executeCommands_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "N");
        String commands = "M";

        //when
        marsRover.executeCommands(commands);

        //then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(1, marsRover.getYLocation());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    public void should_0_minus_1_S_when_executeCommands_given_0_0_S_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0, 0, "S");
        String commands = "M";

        //when
        marsRover.executeCommands(commands);

        //then
        assertEquals(0, marsRover.getXLocation());
        assertEquals(-1, marsRover.getYLocation());
        assertEquals("S", marsRover.getDirection());
    }
}
