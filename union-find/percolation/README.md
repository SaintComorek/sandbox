# Percolation 
More information on percolation theory [Click Me] https://en.wikipedia.org/wiki/Percolation_theory.

## The model 

We model a percolation system using an n-by-n grid of sites. Each site is either open or blocked. A full site is an open site that can be connected to an open site in the top row via a chain of neighboring (left, right, up, down) open sites. We say the system percolates if there is a full site in the bottom row. In other words, a system percolates if we fill all open sites connected to the top row and that process fills some open site on the bottom row.

### Model that does percolate
Note full open site connected from bottom to top.
![percolates](./does_percolate.svg)
### Model that does not percollate 
There is no open site connected from bottom to top.
![does not percolate](./does_not_percolate.svg)

## The task 
Write an implementation of Percolation. Tests will load grid from text files. Each test file will contain a grid n rows by n columns containing information on open sites indicated by value 1 and blocked sites indicated by value 0.

```java
public class Percolation {

    // loads grid from a file
    public void Percolation(File f)

    // opens the site (row, col) if it is not open already
    void open(int row, int col)

    // is the site (row, col) open?
    boolean isOpen(int row, int col)

    // is the site (row, col) full?
    boolean isFull(int row, int col)

    // returns the number of open sites
    int openSitesCount()

    // does the system percolate?
    boolean percolates()

}

```
