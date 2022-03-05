import java.util.* ;
class EarnAndDelete {
    public static int deleteAndEarn(int[] nums) {
        int maxNumber = 0;
        HashMap<Integer, Integer> points = new HashMap<>();
        

        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }
        // System.out.println(points);

        List<Integer> elements = new ArrayList<Integer>(points.keySet());
        Collections.sort(elements);
        // System.out.println(elements);
        
        // Base cases
        int twoBack = 0;
        int oneBack = points.get(elements.get(0));
        
        for (int i = 1; i < elements.size(); i++) {
            int currentElement = elements.get(i);
            int temp = oneBack;
            if (currentElement == elements.get(i - 1) + 1) {
                // The 2 elements are adjacent, cannot take both - apply normal recurrence
                oneBack = Math.max(oneBack, twoBack + points.get(currentElement));
            } else {
                // Otherwise, we don't need to worry about adjacent deletions
                oneBack += points.get(currentElement);
            }

            twoBack = temp;
        }
        
        return oneBack;
    }

    public static void main(String[] args) {
        int arr[] = { 8,3,4,7,6,6,9,2,5,8,2,4,9,5,9,1,5,7,1,4 };
        System.out.println(deleteAndEarn(arr));
    }
}
