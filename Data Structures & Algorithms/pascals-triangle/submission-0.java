class Solution {
    public List<List<Integer>> generate(int numRows) {

        // Create ArrayList to store Pascal's triangle
        List<List<Integer>> triangle = new ArrayList<>();

        // For each row, add a sub list
        for (int i = 0; i < numRows; i++) {
            triangle.add(new ArrayList<>());
        }

        // Add 1 to the first sub list, representing the first row
        triangle.get(0).add(1);

        // Iterate over the other sub lists (rows)
        for (int row = 1; row < triangle.size(); row++) {
            // Add one to beginning of row
            triangle.get(row).add(1);

            // For each 'middle' element
            for (int i = 1; i < row; i++) {
                // Get the sum of the element above the current one and add to row
                int sum = triangle.get(row - 1).get(i - 1) + triangle.get(row - 1).get(i);
                triangle.get(row).add(sum);
            }

            // Add 1 to end of row
            triangle.get(row).add(1);
        }

        return triangle;
    }
}