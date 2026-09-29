class Solution {
    public boolean containsDuplicate(int[] nums) {
        //creating a hashset to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet<>();

        //iterate through each element in the array
        for (int num : nums)
        {
            //check if the element is already in the hashset
            if(seenNumbers.contains(num))
            {
                return true; //dup found
            }
            //add the element to the hashmap if not found
            seenNumbers.add(num);
        }

        return false; // no dups found
    }
}