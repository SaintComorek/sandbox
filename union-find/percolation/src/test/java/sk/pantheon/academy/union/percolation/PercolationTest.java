package sk.pantheon.academy.union.percolation;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.net.URISyntaxException;
import org.junit.jupiter.api.Test;

public class PercolationTest {

    @Test
    public void grid1ShouldPercolate() throws URISyntaxException {
        File gridFile = getGridFile("grid-1.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.percolates());
    }

    @Test
    public void grid1ShouldHave3OpenSites() throws URISyntaxException {
        File gridFile = getGridFile("grid-1.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertEquals(3, percolation.openSitesCount());
    }

    @Test
    public void grid1SiteShouldBeFull() throws URISyntaxException {
        File gridFile = getGridFile("grid-1.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.isFull(0, 0));
    }
    @Test
    public void grid2ShouldHave2OpenSites() throws URISyntaxException {
        File gridFile = getGridFile("grid-2.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertEquals(2, percolation.openSitesCount());
    }
    @Test
    public void grid2SiteShouldBeFull() throws URISyntaxException {
        File gridFile = getGridFile("grid-2.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.isFull(0, 0));
    }
    @Test
    public void grid3ShouldHave0OpenSites() throws URISyntaxException {
        File gridFile = getGridFile("grid-3.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertEquals(0, percolation.openSitesCount());
    }
    @Test
    public void grid3SiteShouldNotBeFull() throws URISyntaxException {
        File gridFile = getGridFile("grid-3.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertFalse(percolation.isFull(0, 0));
    }

    private File getGridFile(final String fileName) throws URISyntaxException {
        return new File(this.getClass().getClassLoader().getResource(fileName).toURI());
    }
}