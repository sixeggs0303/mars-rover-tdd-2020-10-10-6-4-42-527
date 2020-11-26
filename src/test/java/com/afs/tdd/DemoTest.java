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
        assertEquals(1, marsRover.getyLocation());
    }

}
