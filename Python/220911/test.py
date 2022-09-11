def solution(n):

    return sum([i for i in range(1, n+1) if n % i == 0])

def solution(n):
    answer = 0
    
    for i in list(str(n)):answer += int(i)

    return answer