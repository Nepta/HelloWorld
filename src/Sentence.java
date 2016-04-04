import java.util.*;
class Sentence implements HumanString{
	List<Word> wordList;

	Sentence(){
		this.wordList = new ArrayList<>();
	}

	Sentence addWord(Word word){
		this.wordList.add(word);
		return this;
	}

	@Override
	public String toHumanString(){
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(Word word : wordList){
			sb.append(word.toHumanString());
			if(i < wordList.size()){
				sb.append(Punctuation.Space.getSymbol());
			}
			i++;
		}
		return sb.toString();
	}
}
