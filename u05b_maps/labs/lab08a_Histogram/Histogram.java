//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		histogram = new TreeMap<String,Integer>();
	}

	public Histogram(String sent)
	{
		histogram = new TreeMap<String,Integer>();
		String[] words = sent.split(" ");
		for(String word : words){
			if(!histogram.containsKey(word)){
				histogram.put(word, 1);
			}else{
				histogram.put(word, histogram.get(word) + 1);
			}
		}
	}

	public String toString()
	{
		String output="";
		for(String key : histogram.keySet()){
			output += key + "\t";
			for(int i=0; i<histogram.get(key); i++){
				output += "*";
			}
			output += "\n";
		}
		return output;
	}
}