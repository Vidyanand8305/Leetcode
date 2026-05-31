class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            if (!dq.isEmpty()) {
                dq.addFirst(dq.removeLast());
            }
            dq.addFirst(deck[i]);
        }
        int[] result = new int[deck.length];
        int i = 0;
        for (int num : dq) {
            result[i++] = num;
        }

    return result;
    }
}