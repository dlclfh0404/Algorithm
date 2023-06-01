#include <iostream>
#include <string>
#include <algorithm>
#include <map>
#include <vector>
using namespace std;

bool comp(pair<int, string> a, pair<int, string> b)
{
    if (a.first == b.first)
    {
        if (a.second.length() == b.second.length())
            return a.second < b.second; // 사전순 오름차순
        else
            return a.second.length() > b.second.length(); // 단어길이 내림차순
    }
    else
        return a.first > b.first; // 빈도순 내림차순
}
int main()
{
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);
    map<string, int> cl;
    int n, m;
    cin >> n >> m;

    while (n--)
    {
        string str;
        cin >> str;
        if (str.length() < m)
            continue;
        cl[str]++;
    }

    vector<pair<int, string>> wordbook;
    for (auto w : cl)
        wordbook.push_back({w.second, w.first});
    sort(wordbook.begin(), wordbook.end(), comp);
    for (auto s : wordbook)
        cout << s.second << '\n';
}