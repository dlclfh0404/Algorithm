n = int(input()) # 컴퓨터 개수
v = int(input()) # 연결선 개수
graph = [[] for i in range(n+1)] # 그래프 초기화
visited = [0] * (n+1) # 방문한 컴퓨터인지 표시
for i in range(v): # 그래프 생성
    a,b = map(int,input().split())
    graph[a]+=[b] # a에 b 연결
    graph[b]+=[a] # 양방향 연결
def dfs(v):
    visited[v]=1 # 바로 방문 표시
    for nx in graph[v]: # v번 컴퓨터에 연결된 컴퓨터들 리스트
        if visited[nx]==0: # 방문했는지 , 안했는지 검사
            dfs(nx)       # 재귀 호출로 해당 컴퓨터를 방문하고 과정 반복
dfs(1)
print(sum(visited)-1) # 1번 컴퓨터를 제외하고, 1번 컴퓨터와 연결된 컴퓨터 개수 출력을 위한 -1