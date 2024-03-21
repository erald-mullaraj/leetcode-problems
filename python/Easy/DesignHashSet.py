class MyHashSet:

    def __init__(self):
        self.h = {}

    def add(self, key: int) -> None:
        self.h[key] = True

    def remove(self, key: int) -> None:
        if key in self.h:
            del self.h[key]

    def contains(self, key: int) -> bool:
        return key in self.h