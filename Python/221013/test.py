# 10진수를 2진수로
def solution(num) : 
    if num == 0 : 
        return
    else :
        solution(num//2)
        print(num%2, end="")

N = int(input())
solution(N)