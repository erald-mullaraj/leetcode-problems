def saFrutaNgelen(frutat):
    a = 0
    r = 0
    for f in frutat:
        if(a == f):
            r += 1
        elif r == 0:
            a = f
            r += 1
        elif r == 1:
            a = 0
            r -= 1
        else:
            r -= 1
    return r


fr = [1, 2, 1, 2, 1, 2, 1, 2, 1]
print(saFrutaNgelen(fr))