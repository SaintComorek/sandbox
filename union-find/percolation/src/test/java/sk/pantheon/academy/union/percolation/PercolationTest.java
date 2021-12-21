package sk.pantheon.academy.union.percolation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PercolationTest {

    @Test
    public void wrongNameFile()  {
        Exception exception = assertThrows(FileNotFoundException.class, () -> {
            new Percolation(new File(
                    "src/test/resources/grid-4.txt"));
        });
        String expectedMessage = "Could not find file.";
        Assertions.assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    public void grid1ShouldPercolate() throws Exception {
        File gridFile = getGridFile("grid-1.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.percolates());
    }

    @Test
    public void grid1ShouldHave21OpenSites() throws Exception {
        File gridFile = getGridFile("grid-1.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertEquals(21, percolation.countSetsAfterUnifySets());
    }

    @Test
    public void siteWithIndexesR0C0Ingrid1ShouldBeFull() throws Exception {
        File gridFile = getGridFile("grid-1.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.isSiteFull(0, 0));
    }

    @Test
    public void siteWithIndexesR3C10Ingrid1ShouldBeFull() throws Exception {
        File gridFile = getGridFile("grid-1.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.isSiteFull(3, 10));
    }

    @Test
    public void siteWithIndexesR5C15Ingrid1ShouldBeNotFull() throws Exception {
        File gridFile = getGridFile("grid-1.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertFalse(percolation.isSiteFull(5, 15));
    }

    @Test
    public void grid2ShouldPercolate() throws Exception {
        File gridFile = getGridFile("grid-2.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.percolates());
    }

    @Test
    public void grid2ShouldHave23OpenSites() throws Exception {
        File gridFile = getGridFile("grid-2.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertEquals(23, percolation.countSetsAfterUnifySets());
    }

    @Test
    public void siteWithIndexesR0C0Ingrid2ShouldBeFull() throws Exception {
        File gridFile = getGridFile("grid-2.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.isSiteFull(0, 0));
    }

    @Test
    public void siteWithIndexesR7C2Ingrid2ShouldBeFull() throws Exception {
        File gridFile = getGridFile("grid-2.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.isSiteFull(7, 2));
    }

    @Test
    public void grid3ShouldHave27OpenSites() throws Exception {
        File gridFile = getGridFile("grid-3.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertEquals(27, percolation.countSetsAfterUnifySets());
    }

    @Test
    public void siteWithIndexesR0C0Ingrid3ShouldBeFull() throws Exception {
        File gridFile = getGridFile("grid-3.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertTrue(percolation.isSiteFull(0, 0));
    }

    @Test
    public void grid3ShouldNotPercolate() throws Exception{
        File gridFile = getGridFile("grid-3.txt");
        final Percolation percolation = new Percolation(gridFile);
        assertFalse(percolation.percolates());
    }
    private File getGridFile(final String fileName) throws URISyntaxException {
        return new File(this.getClass().getClassLoader().getResource(fileName).toURI());
    }
}