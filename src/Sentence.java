import java.util.*;
class Sentence{
	List<Word> wordList;

	Sentence(){
		this.wordList = new ArrayList<>();
	}

	Sentence addWord(Word word){
		this.wordList.add(word);
		return this;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(Word word : wordList){
			sb.append(word.toString());
			if(i < wordList.size()){
				sb.append(" ");
			}
			i++;
		}
		return sb.toString();
	}
}
