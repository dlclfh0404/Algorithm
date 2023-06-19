#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);  // 막대기의 개수
    int sticks[N];  // 막대기들의 높이를 저장할 배열

    for (int i = 0; i < N; i++) {
        scanf("%d", &sticks[i]);
    }

    int count = 1;  // 보이는 막대기의 개수, 최소한 첫 번째 막대기는 보인다.
    int maxHeight = sticks[N - 1];  // 현재까지 가장 큰 막대기의 높이

    // 뒤에서부터 순회하면서 가장 큰 막대기부터 시작하여 보이는 막대기인지 체크
    for (int i = N - 2; i >= 0; i--) {
        if (sticks[i] > maxHeight) {
            count++;
            maxHeight = sticks[i];
        }
    }

    printf("%d\n", count);

    return 0;
}