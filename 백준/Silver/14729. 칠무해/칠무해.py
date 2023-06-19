n=int(input()) # 학생의 수
tmp=[float(input()) for i in range(7)] # 학생들의 성적을 담을 배열
tmp.sort() # 오름차순으로 정렬
for i in range(n-7): # 학생수 만큼 반복
    cnt=float(input()) # 학생의 성적을 실수로 입력받기
    if tmp[6]>cnt: # 가장 큰 수의 성적이 현재 숫자 cnt 보다 큰지 확인
        tmp.pop() # 가장 작은 원소 제거
        tmp.append(cnt) # 현재 숫자 cnt를 tmp 리스트에 추가
    tmp.sort() # 그 후 다시 정렬
for i in tmp: # 최종 정렬 된 숫자를 출력
    print("%.3f"%(i)) # 세자리 까지 출력