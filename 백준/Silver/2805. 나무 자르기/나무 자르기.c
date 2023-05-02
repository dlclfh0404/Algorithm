#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int n, m, i;
    int* tree_list;
    long long left, mid, right, sum, max, cut_max;

    scanf("%d %d", &n, &m);
    tree_list = (int*)malloc(n * sizeof(int));

    for (i = 0, max = 0; i < n; i++)
    {
        scanf(" %d", &tree_list[i]);

        // 나무 중 제일 긴 나무의 길이 저장.
        if (max < tree_list[i])
        {
            max = tree_list[i];
        }
    }

    left = 1, right = max, cut_max = 0;
    while (left <= right)
    {
        // 절단기 높이.
        mid = (left + right) / 2;

        for (i = 0, sum = 0; i < n; i++)
        {
            // 절단기 높이보다 긴 나무의 경우에만 sum.
            if (tree_list[i] - mid > 0)
            {
                sum = sum + (tree_list[i] - mid);
            }
        }

        // 원하는 길이에 못미치므로 절단기 높이를 낮춰야함
        if (sum < m)
        {
            right = mid - 1;
        }
        // 절단기 높이를 더 높여도 됨.
        else
        {
            //절단기의 최대높이 갱신
            if (cut_max < mid)
            {
                cut_max = mid;
            }
            left = mid + 1;
        }
    }

    printf("%lld\n", cut_max);

    free(tree_list);
    return 0;
}