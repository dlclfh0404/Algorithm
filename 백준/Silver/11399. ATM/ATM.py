n = int(input()) # 사람 수 입력
p = list(map(int, input().split())) # 기다리는 사람들 리스트 형태

p.sort() #작은 순서대로 정렬
result = 0 # 정답 변수 

for _ in range(1, n+1):
    result += sum(p[0:_]) # 리스트 0번째 수 부터 _번쨰 수까지 더함
print(result)