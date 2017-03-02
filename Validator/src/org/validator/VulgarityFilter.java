/**
 * 
 */
package org.validator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Filter;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang3.StringUtils;
import org.validator.obfuscator.LeetObfuscator;
import org.validator.obfuscator.Obfuscator;
import org.validator.obfuscator.SimpleObfuscator;

/**
 * @author t61hha6
 *
 */
public class VulgarityFilter implements WordFilter {

	final Logger logger = Logger.getLogger(Filter.class.getName());
	private LANG language = LANG.EN;
	private Collection<String> dictionary;
	private Obfuscator obfuscator = new SimpleObfuscator();
	
	public enum LANG {
		EN;
	}

	public VulgarityFilter() {
		this(LANG.EN);
	}
	
	public VulgarityFilter(LANG lang) {
		this.language = lang;
		this.dictionary = loadDictionary();
		
		for (String string : dictionary) {
			System.out.println(string);
		}
	}
	
	public FilterResult filter(String value) {
		FilterResult result = new FilterResult();
		
		String[] words = StringUtils.split(value);
		for (String word : words) {
			if (dictionary.contains(word)) {
				result.setVulgarity(true);
				value = StringUtils.replace(value, word, obfuscator.obfuscate(word));
			}
		}
		result.setMask(value);
		
		return result;
	}
	
	private List<String> loadDictionary() {
		List<String> dictionary = new ArrayList<String>();  

		File file = FileUtils.getFile("resources/" + getLanguage().toString());
		try {
			LineIterator lineIterator = FileUtils.lineIterator(file);
			while (lineIterator.hasNext()) {
				dictionary.add(lineIterator.nextLine());
			}
		} catch (IOException e) {
			logger.severe("Unable to load words for language " + getLanguage());
		}
		
		Obfuscator leet = new LeetObfuscator();
		
		List<String> leetDictionary = new ArrayList<String>();
		for (String word : dictionary) {
			String tword = leet.obfuscate(word);
			if (!tword.equals(word)) {
				leetDictionary.add(tword);
			}
		}
		dictionary.addAll(leetDictionary);
		
		return dictionary;
	}

	/*
	private String doFilter(String toBeFiltered) {

		if (toBeFiltered.equals("")) {
			return "Empty string cannot be filtered!";
		} else {

			logger.warning("Received query param : input ---> " + toBeFiltered);

		}

		logger.warning("Received query param : lang ---> " + language);

		File file = FileUtils.getFile(getLanguage().toString());
		LineIterator lineIterator = FileUtils.lineIterator(file);
		while (lineIterator.hasNext()) {
			String line = lineIterator.nextLine();
			filtered = filteringProcessor(listSplitted[i]);
			listSplitted[i] = filtered;
		}
					
		finalResult = finalResult.substring(0, finalResult.length() - 1);
		logger.warning(finalResult);
		return finalResult;
	}

	private String filteringProcessor(String langToBeFound, String inputToBeFiltered) {

		String folderPath = "src/";

		java.nio.file.Path path = Paths.get(folderPath, langToBeFound);
		Charset charset = Charset.forName("ISO-8859-1");
		String line;
		String temp = "";
		String leet_temp = "";

		if (langToBeFound.equals("")) {

			File dir = new File(folderPath);
			File[] directoryListing = dir.listFiles();

			if (directoryListing != null) {

				for (File child : directoryListing) {

					// Do something with child
					String path_to_child = child.getAbsolutePath();
					java.nio.file.Path path_to_specific = Paths.get(path_to_child);

					try (BufferedReader reader = Files.newBufferedReader(path_to_specific, charset)) {
						while ((line = reader.readLine()) != null) {

							if (line.equals(inputToBeFiltered)) {
								for (int x = 0; x < inputToBeFiltered.length(); x++) {
									temp += "*";
								}
								return temp;
							} else {
								leet_temp = leetReplace(line);

								if (leet_temp.equals(inputToBeFiltered)) {

									logger.warning("Original input matched with l33t speak --> " + leet_temp);

									for (int x = 0; x < inputToBeFiltered.length(); x++) {
										temp += "*";
									}
									return temp;
								}
							}
						}
					} catch (IOException e) {
						logger.severe(String.valueOf(e));
					}
				}

			} else {
				logger.severe("Curse word dictionary files cannot be found! You forgot to init git submodule");
			}

		} else {
			try (BufferedReader reader = Files.newBufferedReader(path, charset)) {

				while ((line = reader.readLine()) != null) {

					if (line.equals(inputToBeFiltered)) {

						for (int x = 0; x < inputToBeFiltered.length(); x++) {
							temp += "*";

						}
						return temp;
					} else {
						leet_temp = leetReplace(line);

						if (leet_temp.equals(inputToBeFiltered)) {

							logger.warning("Original input matched with l33t speak --> " + leet_temp);

							for (int x = 0; x < inputToBeFiltered.length(); x++) {
								temp += "*";
							}
							return temp;
						}
					}
				}
			} catch (IOException e) {
				logger.severe(String.valueOf(e));
			}
		}

		return inputToBeFiltered;
	}
	*/
	
	public LANG getLanguage() {
		return language;
	}

	
	public void setLanguage(LANG language) {
		this.language = language;
	}

}
