/**
 * Project name(项目名称)：算法_冒泡排序
 * Package(包名): PACKAGE_NAME
 * Class(类名): bubble_sort
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/20
 * Time(创建时间)： 13:10
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class bubble_sort
{
    public static void sort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            // 从第 1 个元素开始遍历，遍历至 length-1-i
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                // 比较 list[j] 和 list[j++] 的大小
                if (arr[j] > arr[j + 1])
                {
                    // 交换 2 个元素的位置
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                print(arr);
            }
            System.out.println("------------------");
        }
    }

    private static void print(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}