#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>

int compare(int* a, int* b) {
	return *a - *b;
}

int finding(int*, int, int, int);
int arr1[500001];
int arr2[500001];

int main() {
	int N, M;
	int i;
	scanf("%d", &N);

	for (i = 0; i < N; i++)
		scanf("%d", &arr1[i]);
	qsort(arr1, N, sizeof(int), compare);

	scanf("%d", &M);

	for (i = 0; i < M; i++)
		scanf("%d", &arr2[i]);

	for (i = 0; i < M; i++)
		printf("%d ", finding(arr1, 0, N - 1, arr2[i]));
	return 0;
}

int finding(int* arr1, int left, int right, int num) {
	int middle = (left + right) / 2;
	if (num == arr1[middle])
		return 1;
	
	else if (num < arr1[middle]) {
		if (left == right)
			return 0;
		else
			finding(arr1, left, middle, num);
	}
	else {
		if (left == right)
			return 0;
		else
			finding(arr1, middle + 1, right, num);
	}
}