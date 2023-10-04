import sys
import heapq
input = sys.stdin.readline

d = []

for i in range(int(input())):
    n = int(input())
    
    if n == 0:
        if len(d):
            print(heapq.heappop(d))
        else:
            print(0)
            
    else:
        heapq.heappush(d, n)