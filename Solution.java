/**
 * Created by novax_000 on 2016/4/1.
 */

/**
 * 在一个二维数组中，
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int [][] array, int target)
    {
        int first = array.length-1;
        int second = array[0].length-1;
        int i=0;
       // System.out.println("first is "+first+" second is "+second);
        while(first>=0&&i<=second)
        {
            if(target>array[first][i])
            {
                i++;
            }else if(target<array[first][i])
            {
                first--;
            }else if(target==array[first][i])
            {
                return true;
            }
        }
        return false;
    }
}
