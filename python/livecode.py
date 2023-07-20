from nltk.tokenize import RegexpTokenizer
from typing import List, Dict

class VocabBuilder:
    def __init__(self):
        self._rawTextList = []
        self._vocab = {}

    def getRawText(self):
        return self._rawTextList
    
    def getVocab(self):
        return self._vocab
    
    def getWordCount(self):
        return len(self._rawTextList)
    
    def getTypeCount(self):
        return len(self._vocab)
    
    def readFile(self, filename):
        tokenizer = RegexpTokenizer(r'[\w’-]+')
        with open(filename, 'r') as f:
            self._rawTextList = tokenizer.tokenize(f.read().lower())

    def buildVocab(self):
        for word in self._rawTextList:
            if word in self._vocab.keys():
                self._vocab[word] = self._vocab[word] + 1
            else:
                self._vocab[word] = 1

class UnigramModel:
    def __init__(self):
        self._model = {}

    # def loadData(self, vocab, wordCount):

    # def getModel(self):
    #     return self._model

if __name__ == "__main__":
    vb = VocabBuilder()
    vb.readFile('mytext.txt')
    print(vb.getRawText())
    vb.buildVocab()
    print(vb.getVocab())

    # um = UnigramModel()
    # um.loadData()
    # print(um.getModel())