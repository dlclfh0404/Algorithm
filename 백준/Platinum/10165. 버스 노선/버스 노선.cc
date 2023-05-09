#include <bits/stdc++.h>

using namespace std;

vector<int> res;

// 노선 정렬 비교 함수
bool cmp(vector<int> &l, vector<int> &r)
{
    if (l[0] == r[0])
        return l[1] > r[1];
    return l[0] < r[0];
}

// 작은 번호부터 출력하기 위한 정렬 비교 함수
bool cmpnum(vector<int> &l, vector<int> &r) { return l[2] < r[2]; }

int main()
{
    ios::sync_with_stdio(false); cin.tie(nullptr);
    
    int n, m;
    cin >> n >> m;
    
    vector<vector<int>> v(m, vector<int>(3));
    
    int circlemax = 0;
    
    for (int i = 0; i < m; ++i)
    {
        cin >> v[i][0] >> v[i][1];
        
        
        if (v[i][0] > v[i][1])
        {
            // circle이 가질 수 있는 종착점의 최댓값을 찾는다.
            circlemax = max(circlemax, v[i][1]);
            // 스위핑 전처리를 위해 n을 더해준다.
            v[i][1] += n;
        }
        
        v[i][2] = i + 1;
    }
    
    sort(v.begin(), v.end(), cmp);
    
    vector<vector<int>> res;
    
    for (int j = 0; j < m; ++j)
    {
        if (v[j][1] <= circlemax)
            continue;
        if (res.empty() || (res.size() && res.back()[1] < v[j][1]))
            res.push_back(v[j]);
    }
    
    sort(res.begin(), res.end(), cmpnum);
    
    for (auto &t : res)
        cout << t[2] << ' ';
}