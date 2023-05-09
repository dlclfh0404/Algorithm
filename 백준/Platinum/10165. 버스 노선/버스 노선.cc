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
        
        // 노선의 종류가 circle이라면
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
        // 3번 경우에 대해 검사하는 조건문이다. (line과 circle)
        // 해당 노선이 circlemax 범위 안에 포함되는가? 그렇다면 답이 될 수 없다.
        // circle의 경우는 이미 n을 더했으므로 이 조건문에 걸리지 않는다.
        if (v[j][1] <= circlemax)
            continue;

        // 어떤 노선에 포함되지 않는가?
        // 시작점은 오름차순 정렬된 상태이므로 비교하지 않아도 된다. 종착점만 비교하여 걸러낸다.
        if (res.empty() || (res.size() && res.back()[1] < v[j][1]))
            res.push_back(v[j]);
    }
    
    sort(res.begin(), res.end(), cmpnum);
    
    for (auto &t : res)
        cout << t[2] << ' ';
}