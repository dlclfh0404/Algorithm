# 정수 n을 입력받음
n = int(input())

# 공백으로 구분된 정수들을 입력받아 리스트 pw에 저장
pw = list(map(int, input().split()))

# 문자열을 입력받을 변수 data
data = input()

# 결과를 저장할 빈 리스트 result를 생성
result = []

# 입력된 문자열 data의 각 문자를 순회
for r in data:
    
    # 현재 문자가 공백 문자인 경우
    if r.isspace():
        result.append(0)
        
    # 현재 문자가 소문자 알파벳인 경우
    elif r.islower():
        # 해당 문자의 아스키 코드 값에서 70을 뺀 결과를 result 리스트에 추가
        result.append(ord(r) - 70)
        
    # 현재 문자가 대문자 알파벳인 경우
    elif r.isupper():
        # 해당 문자의 아스키 코드 값에서 64를 뺀 결과를 result 리스트에 추가
        result.append(ord(r) - 64)

# 리스트 pw와 결과 리스트 result를 정렬한 결과가 같은지 확인
if sorted(pw) == sorted(result):
    # 일치하면 'y' 출력
    print('y')
else:
    # 일치하지 않으면 'n' 출력
    print('n')