def seperation(p) :
    # a는 더이상 분리가 안됨.
    # b는 빈문자열이 될 수 있음.
    c = 0
    idx = 0
    for i, s in enumerate(p) :
        if s == "(" : 
            c += 1
        elif s == ")" :
            c -= 1
        if c == 0 :
            idx = i+1
            return p[:idx], p[idx:]


def checking(u) :
    c = 0
    for i in u :
        if i == "(" : 
            c += 1
        else :
            if c == 0 :
                return False
            c -= 1
    return True


def solution(p):
    answer = ''
    # 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다. 
    if len(p) == 0 :
        return answer
    # 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다. 
    u, v = seperation(p)
                      
    # 3. 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
    check = checking(u)

    if check == True :
        return u + solution(v) # 3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다. 
    else : # 4. 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다. 
        u = u[1:-1]
        for i in range(len(u)) :
            if u[i] == "(" :
                u[i] = ")"
            else :
                u[i] = "("
    return "(" + solution(v) + ")" + u

    print(solution("()))((()"))