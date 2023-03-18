tmp = list(map(int, input().split()))
print('1' if tmp.count(1) > tmp.count(2) else '2')