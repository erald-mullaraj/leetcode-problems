def saFrutaNgelen(frutat):
    a = frutat[0]
    r = 0
    for f in frutat:
        if(a == f):
            r += 1
        else:
            if(r == 0):
                a = f
                r += 1
            if(r == 1):
                a = 0
                r -= 1
            else:
                r -= 1
    return r


fr = [2, 2, 3, 2, 2, 3, 1]
print(saFrutaNgelen(fr))