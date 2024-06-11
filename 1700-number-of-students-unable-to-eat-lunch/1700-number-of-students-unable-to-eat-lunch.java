class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] c=new int[2];
        for(final int student:students)
            ++c[student];
        for(int i=0;i<sandwiches.length;++i){
            if(c[sandwiches[i]]==0)
                return sandwiches.length-i;
            --c[sandwiches[i]];
        }
        return 0;
    }
}