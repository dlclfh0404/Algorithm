#include <iostream>
#include <stdio.h>
#include <queue>
using namespace std;

int N, x;
string str;
queue<int> q;

int main()
{
    // 빠른 입출력을 위해
    cin.tie(NULL);
    cin.sync_with_stdio(false);

    cin >> N;

    for (int i = 0; i < N; i++)
    {
        cin >> str;

        if (str == "push")
        {
            cin >> x;
            q.push(x);
        }
        else if (str == "pop")
        {
            if (!q.empty())
            {
                cout << q.front() << '\n';
                q.pop();
            }
            else
                cout << -1 << '\n';
        }
        else if (str == "size")
        {
            cout << q.size() << '\n';
        }
        else if (str == "empty")
        {
            cout << q.empty() << '\n';
        }
        else if (str == "front")
        {
            if (!q.empty())
                cout << q.front() << '\n';
            else
                cout << -1 << '\n';
        }
        else
        { // s == "back"
            if (!q.empty())
                cout << q.back() << '\n';
            else
                cout << -1 << '\n';
        }
    }
}