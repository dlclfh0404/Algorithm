def is_palindrome(n):
    # 주어진 수가 대칭수인지 판별하는 함수
    return str(n) == str(n)[::-1]

# 테스트 케이스 개수 입력받기
T = int(input())

for _ in range(T):
    # 수 입력받기
    num = int(input())

    # 수를 뒤집은 값과 원래 값의 합 구하기
    reversed_num = int(str(num)[::-1])
    total = num + reversed_num

    # 합이 대칭수인지 판별하여 결과 출력하기
    if is_palindrome(total):
        print("YES")
    else:
        print("NO")