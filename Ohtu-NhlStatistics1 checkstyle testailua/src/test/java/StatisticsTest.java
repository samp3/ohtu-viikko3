/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import ohtuesimerkki.Player;
import ohtuesimerkki.Statistics;
import ohtuesimerkki.ReaderStub;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sampe
 */
public class StatisticsTest {

    Statistics stats;
    ReaderStub reader = new ReaderStub();

    public StatisticsTest() {
        this.stats = new Statistics(reader);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSearch() {
        this.stats.search("Semenko");
    }

    @Test
    public void testSearch2() {
        this.stats.search("Luukkainen");
    }

    @Test
    public void testTeam() {
        this.stats.team("EDM");
    }

    @Test
    public void testTopScorers() {
        this.stats.topScorers(3);
    }

}
