class Produto:
    nomeloja: str = None
    preço: float = None
    descricao: str = None

    def __init__(self, desc):
        self.descricao = desc

    def getDescricao(self):
        return self.descricao