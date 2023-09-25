n = int(input())
room = []

for _ in range(n):
    a, b = map(int, input().split())
    room.append([a, b])

room = sorted(room, key=lambda x: x[0]) # 시작시간을 오름차순 정렬
room = sorted(room, key=lambda x: x[1])# 끝나는 시간을 기준으로 다시 오름차순

time = 0 # 회의 마지막 시간을 저장할 변수
result = 0 # 회의 개수를 저장할 변수

for i, j in room:
    if i >= time:
        result += 1
        time = j
        
print(result)
