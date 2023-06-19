N = int(input())  # 막대기의 개수
sticks = []  # 막대기들의 높이를 저장할 리스트

for _ in range(N):
    height = int(input())
    sticks.append(height)

count = 1  # 보이는 막대기의 개수, 최소한 첫 번째 막대기는 보인다.
max_height = sticks[-1]  # 현재까지 가장 큰 막대기의 높이

# 뒤에서부터 순회하면서 가장 큰 막대기부터 시작하여 보이는 막대기인지 체크
for i in range(N-2, -1, -1):
    if sticks[i] > max_height:
        count += 1
        max_height = sticks[i]

print(count)