import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  
  public Location getNextLoc(int row, int col) {
    boolean hasRight = (col + 1 < grid[0].length);
    boolean hasBelow = (row + 1 < grid.length);

    
    if (hasRight && hasBelow) {
        if (grid[row][col + 1] < grid[row + 1][col]) {
            return new Location(row, col + 1);
        } else {
            return new Location(row, row + 1);
        }
    }
    
    else if (hasRight) {
        return new Location(row, col + 1);
    }
    
    else if (hasBelow) {
        return new Location(row + 1, col);
    }
    
    return null;
    
  }

  
  
  public int sumPath(int row, int col) {
    int sum = 0;
    while (row < grid.length - 1 || col < grid[0].length - 1) {
        sum += grid[row][col];
        Location next = getNextLoc(row, col);
        row = next.getRow();
        col = next.getCol();
    }
    
    sum += grid[row][col];
    return sum;
    
  }

   
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
