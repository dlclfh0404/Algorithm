import sys, itertools
input=sys.stdin.readline
T=int(input())
for _ in range(T):
    N=int(input()) # 점의 개수
    points = [] # 좌표의 리스트
    total_x,total_y = 0,0
 
    for _ in range(N):
        x,y = map(int,input().split())
        total_x +=x ; total_y += y # 모든 x의 합과 y의 합 저장
        points.append((x,y))
 
    comb = list(itertools.combinations(points, N//2))
    ans=3e5
    
    for c in comb[:len(comb)//2]: # len(comb)는 항상 짝수
        x1,y1 = 0,0
        for x,y in c:
            x1 += x ; y1 += y
        x2,y2 = total_x-x1,total_y-y1 # x와 y를 x1,y1과 x2,y2 두 그룹으로 절반 나누기
        
        hab_vector = ((x2-x1)**2 + (y2-y1)**2)**(0.5) # 절반 나눈 두 그룹간의 합벡터
        ans=min(ans,hab_vector)
    print(ans)
