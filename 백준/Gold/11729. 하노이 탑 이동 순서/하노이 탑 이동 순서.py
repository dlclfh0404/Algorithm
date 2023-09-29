n = int(input())
def hanoi(n, start, end) :
# start 에서 end번으로 옮김
    if n == 1 : 
        print(start, end)
        return
    
    # 옮길1,2,3을 다 합치면 6
    # 6에서 start, end를 빼주면 번호 모를막대의 번호를 앎
    # 그 후 start에서 end로 옮겨주면 되고
    # 그 후 에는 똑같이 돌아감 
    hanoi(n-1, start, 6-start-end) 
    print(start, end) 
    hanoi(n-1, 6-start-end, end) 
    
print(2**n-1) # 최소 이동횟수
hanoi(n, 1, 3)