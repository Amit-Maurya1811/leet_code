class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> n1=new HashSet<>();
        HashSet<Integer> n2=new HashSet<>();
        for(int num:nums1)
        {
            n1.add(num);
        }
        for(int num:nums2)
        {
            n2.add(num);
        }
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();

        for(int num:n1)
        {
            if(!n2.contains(num))
            l1.add(num);
        }
        for(int num:n2)
        {
            if(!n1.contains(num))
            l2.add(num);
        }
        l.add(l1);
        l.add(l2);
        return l;
    }
}