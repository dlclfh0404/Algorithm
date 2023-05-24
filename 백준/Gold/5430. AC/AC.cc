#include<iostream>
#include<string.h>
#include<deque>
using namespace std;

int T, n, num, d = 0;
int flag = 1; // 1이면 정방향, -1이면 역방향, -2이면 error
string language, arr;
deque<int> dq;

int main()
{
	cin >> T;

	for (int i = 0; i < T; i++)
	{
		d = 0;
		flag = 1;
		num = 0;

		cin >> language; // RDD
		cin >> n; // 4
		cin >> arr; // [1,2,3,4]

		for (int j = 1; j < arr.size(); j++)
		{
			if (arr[j] == ',' || arr[j] == ']')
			{
				dq.push_back(num);
				num = 0;
			}
			else if (arr[j] != ',')
			{
				num *= 10;
				num += arr[j] - '0';// 문자를 숫자로 저장
			}
		}

		for (int j = 0; j < language.size(); j++)
		{
			if (language.at(j) == 'R')
			{
				flag *= -1;
			}
			else if (language.at(j) == 'D')
			{
				d++;
				if (d > n) // D가 원소 수 보다 많을 때 error
				{
					flag = -2;
					break;
				}

				if (flag == 1) dq.pop_front();
				else dq.pop_back(); // (flag == -1)
			}
		}

		if (n == d) cout << "[]\n"; // 배열이 비어있을 때
		else if (flag == 1) // 정방향 출력
		{
			cout << "[";
			for (int j = 0; j < dq.size() - 1; j++)
				cout << dq.at(j) << ',';
			cout << dq.at(dq.size() - 1) << "]" << '\n';
		}
		else if (flag == -1) // 역방향 출력
		{
			cout << "[";
			for (int j = dq.size() - 1; j >= 1; j--)
				cout << dq.at(j) << ',';
			cout << dq.at(0) << "]" << '\n';
		}
		else if (flag == -2) cout << "error\n"; // error

		dq.clear();
	}
}