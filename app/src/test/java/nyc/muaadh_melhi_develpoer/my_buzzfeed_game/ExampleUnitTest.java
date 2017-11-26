package nyc.muaadh_melhi_develpoer.my_buzzfeed_game;

import org.junit.Test;

import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score.Score;
import nyc.muaadh_melhi_develpoer.my_buzzfeed_game.Score.ZombieScore;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

    }
    @Test
    public void zombieScoreTest() throws Exception{
        assertEquals("are Cool, You care about friends and family from other zombies and bullies., keep going,  but try harder!", ZombieScore.scoreConverter(7));
    }
    @Test
    public void ScoreTest() throws Exception{
        assertEquals(" a beginner, continue to pursue your pokemon master path.", Score.scoreConverter(3));
    }
}