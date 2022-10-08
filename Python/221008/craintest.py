def solution(board, moves):
    answer = 0
    li1 = []
    
    for i in moves : 
        for n in range(0, len(board)) : 
            if board[n][i-1] != 0 :
                li1.append(board[n][i-1])
                board[n][i-1] = 0
                if len(li1) >= 2 :
                    if li1[len(li1) -2] == li1[len(li1) -1] :
                        li1.pop()
                        li1.pop()
                        answer += 2
                        break
                break
    return answer