import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testAStar1() {
        int correctDistance = 7;

        AStarSearchGraph g2 = new AStarSearchGraph();
        g2.addVertex("A", 0, 0);
        g2.addVertex("B", 0, 1);
        g2.addVertex("C", 0, 2);
        g2.addVertex("D", 0, 3);
        g2.addVertex("E", 1, 0);
        g2.addVertex("F", 1, 1);
        g2.addVertex("G", 1, 2);
        g2.addVertex("H", 1, 3);
        g2.addVertex("I", 2, 0);
        g2.addVertex("J", 2, 1);
        g2.addVertex("K", 2, 2);
        g2.addVertex("L", 2, 3);
        g2.addVertex("M", 3, 0);
        g2.addVertex("N", 3, 1);
        g2.addVertex("O", 3, 2);
        g2.addVertex("P", 3, 3);
        g2.addEdge("A", "B", 1);
        g2.addEdge("B", "C", 1);
        g2.addEdge("C", "D", 1);
        g2.addEdge("E", "F", 3);
        g2.addEdge("F", "G", 1);
        g2.addEdge("G", "H", 1);
        g2.addEdge("I", "J", 3);
        g2.addEdge("J", "K", 1);
        g2.addEdge("K", "L", 1);
        g2.addEdge("M", "N", 2);
        g2.addEdge("N", "O", 1);
        g2.addEdge("O", "P", 3);
        g2.addEdge("A", "E", 3);
        g2.addEdge("B", "F", 1);
        g2.addEdge("C", "G", 1);
        g2.addEdge("D", "H", 1);
        g2.addEdge("E", "I", 4);
        g2.addEdge("F", "J", 2);
        g2.addEdge("G", "K", 1);
        g2.addEdge("H", "L", 1);
        g2.addEdge("I", "M", 3);
        g2.addEdge("J", "N", 1);
        g2.addEdge("K", "O", 1);
        g2.addEdge("L", "P", 3);

        assertEquals(correctDistance, g2.aStar("A", "M"));
    }

    @Test
    public void testAStar2() {
        int correctDistance = 5;

        AStarSearchGraph g2 = new AStarSearchGraph();
        g2.addVertex("A", 0, 0);
        g2.addVertex("B", 0, 1);
        g2.addVertex("C", 0, 2);
        g2.addVertex("D", 0, 3);
        g2.addVertex("E", 1, 0);
        g2.addVertex("F", 1, 1);
        g2.addVertex("G", 1, 2);
        g2.addVertex("H", 1, 3);
        g2.addVertex("I", 2, 0);
        g2.addVertex("J", 2, 1);
        g2.addVertex("K", 2, 2);
        g2.addVertex("L", 2, 3);
        g2.addVertex("M", 3, 0);
        g2.addVertex("N", 3, 1);
        g2.addVertex("O", 3, 2);
        g2.addVertex("P", 3, 3);
        g2.addEdge("A", "B", 1);
        g2.addEdge("B", "C", 1);
        g2.addEdge("C", "D", 1);
        g2.addEdge("E", "F", 3);
        g2.addEdge("F", "G", 1);
        g2.addEdge("G", "H", 1);
        g2.addEdge("I", "J", 3);
        g2.addEdge("J", "K", 1);
        g2.addEdge("K", "L", 1);
        g2.addEdge("M", "N", 2);
        g2.addEdge("N", "O", 1);
        g2.addEdge("O", "P", 3);
        g2.addEdge("A", "E", 3);
        g2.addEdge("B", "F", 1);
        g2.addEdge("C", "G", 1);
        g2.addEdge("D", "H", 1);
        g2.addEdge("E", "I", 4);
        g2.addEdge("F", "J", 2);
        g2.addEdge("G", "K", 1);
        g2.addEdge("H", "L", 1);
        g2.addEdge("I", "M", 3);
        g2.addEdge("J", "N", 1);
        g2.addEdge("K", "O", 1);
        g2.addEdge("L", "P", 3);

        assertEquals(correctDistance, g2.aStar("A", "N"));
    }

    @Test
    public void testAStar3() {
        int correctDistance = 3;

        AStarSearchGraph g2 = new AStarSearchGraph();
        g2.addVertex("A", 0, 0);
        g2.addVertex("B", 0, 1);
        g2.addVertex("C", 0, 2);
        g2.addVertex("D", 0, 3);
        g2.addVertex("E", 1, 0);
        g2.addVertex("F", 1, 1);
        g2.addVertex("G", 1, 2);
        g2.addVertex("H", 1, 3);
        g2.addVertex("I", 2, 0);
        g2.addVertex("J", 2, 1);
        g2.addVertex("K", 2, 2);
        g2.addVertex("L", 2, 3);
        g2.addVertex("M", 3, 0);
        g2.addVertex("N", 3, 1);
        g2.addVertex("O", 3, 2);
        g2.addVertex("P", 3, 3);
        g2.addEdge("A", "B", 1);
        g2.addEdge("B", "C", 1);
        g2.addEdge("C", "D", 1);
        g2.addEdge("E", "F", 3);
        g2.addEdge("F", "G", 1);
        g2.addEdge("G", "H", 1);
        g2.addEdge("I", "J", 3);
        g2.addEdge("J", "K", 1);
        g2.addEdge("K", "L", 1);
        g2.addEdge("M", "N", 2);
        g2.addEdge("N", "O", 1);
        g2.addEdge("O", "P", 3);
        g2.addEdge("A", "E", 3);
        g2.addEdge("B", "F", 1);
        g2.addEdge("C", "G", 1);
        g2.addEdge("D", "H", 1);
        g2.addEdge("E", "I", 4);
        g2.addEdge("F", "J", 2);
        g2.addEdge("G", "K", 1);
        g2.addEdge("H", "L", 1);
        g2.addEdge("I", "M", 3);
        g2.addEdge("J", "N", 1);
        g2.addEdge("K", "O", 1);
        g2.addEdge("L", "P", 3);

        assertEquals(correctDistance, g2.aStar("C", "J"));
    }

    @Test
    public void testAStar4() {
        int correctDistance = 1;

        AStarSearchGraph g2 = new AStarSearchGraph();
        g2.addVertex("A", 0, 0);
        g2.addVertex("B", 0, 1);
        g2.addVertex("C", 0, 2);
        g2.addVertex("D", 0, 3);
        g2.addVertex("E", 1, 0);
        g2.addVertex("F", 1, 1);
        g2.addVertex("G", 1, 2);
        g2.addVertex("H", 1, 3);
        g2.addVertex("I", 2, 0);
        g2.addVertex("J", 2, 1);
        g2.addVertex("K", 2, 2);
        g2.addVertex("L", 2, 3);
        g2.addVertex("M", 3, 0);
        g2.addVertex("N", 3, 1);
        g2.addVertex("O", 3, 2);
        g2.addVertex("P", 3, 3);
        g2.addEdge("A", "B", 1);
        g2.addEdge("B", "C", 1);
        g2.addEdge("C", "D", 1);
        g2.addEdge("E", "F", 3);
        g2.addEdge("F", "G", 1);
        g2.addEdge("G", "H", 1);
        g2.addEdge("I", "J", 3);
        g2.addEdge("J", "K", 1);
        g2.addEdge("K", "L", 1);
        g2.addEdge("M", "N", 2);
        g2.addEdge("N", "O", 1);
        g2.addEdge("O", "P", 3);
        g2.addEdge("A", "E", 3);
        g2.addEdge("B", "F", 1);
        g2.addEdge("C", "G", 1);
        g2.addEdge("D", "H", 1);
        g2.addEdge("E", "I", 4);
        g2.addEdge("F", "J", 2);
        g2.addEdge("G", "K", 1);
        g2.addEdge("H", "L", 1);
        g2.addEdge("I", "M", 3);
        g2.addEdge("J", "N", 1);
        g2.addEdge("K", "O", 1);
        g2.addEdge("L", "P", 3);

        assertEquals(correctDistance, g2.aStar("F", "B"));
    }
}