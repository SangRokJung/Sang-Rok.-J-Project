class Node():
    def __init__(self, data):
        self.data = data
        self.children = {}

class Trie() :
    def __init__(self, data) :
        self.head = Node(Node)

    def insert(self, string) :
        head = self.head

        for s in string : 
            children = head.children
            if s not in children :
                children[s] = Node(s)
            head = children[s]
            