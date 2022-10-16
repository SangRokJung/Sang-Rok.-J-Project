class Node() :
    def __init__(self, data) :
        self.data = data
        self.next = None 

class LinkedList() :
    def __init__(self) :
        self.head = None
        self.count = 0

    def appendHead(self, node) :
        if self.head == None :
            self.head = node
            self.count = 1
        else :
            self.count += 1
            currentHead = self.head
            self.head = node
            node.next = currentHead

    def append(self, node) : 
        if self.head == None :
            self.head = node
            self.count = 1
        else :
            now = self.head
            while now.next != None :
                now = now.next
            now.next = node
            self.count += 1

    def insertNodeAtIndex(self, node, index) : 
        if index < 0 or index > self.count:
            return -1
        elif self.count == index :
            self.append(node)
        elif index == 0:
            self.appendHead(node)
        else : 
            now = self.head
            while index > 0 :
                index -= 1
                now = now.next
            self.count += 1
            next = now.next
            now.next = Node
            node.next = next
    
    def deleteData(self, data) :
        if self.head.data == data :
            self.head = self.head.next
            self.count -= 1
        else :
            first = self.head
            second = first.next
            while second != None :
                if second.data == data:
                    first.next = second.next
                    self.count -= 1
                    break
                first = second
                second = second.next

    def getCount(self):
        return self.count
