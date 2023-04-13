#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int *twoSum(int *nums, int numsSize, int target, int *returnSize)
{
    for (int i = 0; i < nums[i]; ++i)
    {
        numsSize = nums[i] + nums[i];
        if (numsSize == target)
        {
            return returnSize;
            printf("%d", returnSize);
        }
    }
}

int main()
{
    int nums[] = {2, 7, 11, 15};
    int numsSize = 0;
    int target = 9;
    int returnSize[] = {};
    
    for (int i = 0; i < nums[i]; i++)
    {
        returnSize[i] += nums[i + 1];
        printf("%d\n", returnSize[i]);
    }
}