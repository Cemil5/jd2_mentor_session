package week_26_LinkedList_TicketingMVCPart2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void withBruteForce() {
        int[] ints = {7, 1, 5, 3, 6, 4};
        int actualProfit = BestTimeToBuyAndSellStock.withBruteForce(ints);
        assertEquals(5, actualProfit);
    }

    @Test
    void withOneLoop() {
        int[] ints = {7, 1, 5, 3, 6, 4};
        int actualProfit = BestTimeToBuyAndSellStock.withOneLoop(ints);
        assertEquals(5, actualProfit);
    }
}