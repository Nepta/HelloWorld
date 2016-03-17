import java.util.*;
class Sentence{
	List<String> wordList;

	Sentence(){
		this.wordList = new ArrayList<>();
	}

	Sentence addWord(String word){
		this.wordList.add(word);
		return this;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(String word : wordList){
			sb.append(word);
			if(i < wordList.size()){
				sb.append(" ");
			}
			i++;
		}
		return sb.toString();
	}
}
