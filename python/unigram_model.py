from nltk.tokenize import RegexpTokenizer
from typing import List, Dict

class VocabBuilder:
    '''
    This class will read a text file, tokenize it and then build a vocabulary
    from the words contained in it.  The vocabulary includes a count of the
    occurrences of words in the corpus (text).
    '''
    def __init__(self, file) -> None:
        self._text = self._readText(file)
        self._vocab = self._buildVocab()
    
    def _readText(self, file) -> List[str]:
        tokenizer = RegexpTokenizer(r'[\w\’-]+')
        with open(file, 'r') as f:
            text = tokenizer.tokenize(f.read().lower())
        return text

    def getText(self) -> List[str]:
        return self._text
    
    def _buildVocab(self) -> Dict:
        vocab = {}
        for word in self._text:
            if word in vocab.keys():
                vocab[word] = vocab[word] + 1
            else:
                vocab[word] = 1
        return vocab
    
    def getVocab(self) -> Dict:
        return self._vocab
    
    def tokenCount(self) -> int:
        return len(self._text)
    
    def typeCount(self) -> int:
        return len(self._vocab)
    
class UnigramModel:
    '''
    This class receives a VocabBuilder object and constructs a unigram language
    model from it.  The unigram language model simply computes the probability
    of a particular word.
    '''
    def __init__(self, vocab: Dict, wordCount: int) -> None:
        self._unigramModel = {}
        corpusSize = wordCount
        for k,v in vocab.items():
            self._unigramModel[k] = v/corpusSize
    
    def getUnigramModel(self) -> Dict:
        return self._unigramModel
    
def run():
    vb = VocabBuilder('mytext.txt')
    print('VocabBuilder Data:')
    print(f'\tRaw Text List: {vb.getText()}')
    print(f'\tVocabulary: {vb.getVocab()}')
    print(f'\tToken Count: {vb.tokenCount()}')
    print(f'\tType Count: {vb.typeCount()}')

    um = UnigramModel(vb.getVocab(), vb.tokenCount())
    print('\nUnigramModel Data:')
    print(f'\tProbabilities: {um.getUnigramModel()}')

    print('\nEnter a word and I will return the probability that it will appear.  Type "exit!" to quit the program.')
    quit = "exit!"
    word = ""
    while (word != quit):
        word = input("Enter word here: ")
        if word in um.getUnigramModel().keys():
            print(f'{word}: {um.getUnigramModel().get(word)}')
        else:
            print('Word does not exist in vocabulary.')

    print('\nThank you for trying out this unigram model!')

if __name__ == "__main__":
    run()