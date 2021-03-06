package fi.seco.lexical;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CompoundLexicalAnalysisService implements ILexicalAnalysisService {

	private final Map<Locale, ILexicalAnalysisService> bfs = new HashMap<Locale, ILexicalAnalysisService>();
	private final Map<Locale, ILexicalAnalysisService> hfs = new HashMap<Locale, ILexicalAnalysisService>();
	private final Map<Locale, ILexicalAnalysisService> ifs = new HashMap<Locale, ILexicalAnalysisService>();
	private final Map<Locale, ILexicalAnalysisService> ss = new HashMap<Locale, ILexicalAnalysisService>();
	private final Map<Locale, ILexicalAnalysisService> sps = new HashMap<Locale, ILexicalAnalysisService>();	
	private final Map<Locale, ILexicalAnalysisService> ts = new HashMap<Locale, ILexicalAnalysisService>();	

	public CompoundLexicalAnalysisService(ILexicalAnalysisService... services) {
		for (ILexicalAnalysisService s : services) {
			for (Locale l : s.getSupportedBaseformLocales())
				if (!bfs.containsKey(l)) bfs.put(l, s);
			for (Locale l : s.getSupportedSummarizeLocales())
				if (!ss.containsKey(l)) ss.put(l, s);
			for (Locale l : s.getSupportedInflectionLocales())
				if (!ifs.containsKey(l)) ifs.put(l, s);
			for (Locale l : s.getSupportedHyphenationLocales())
				if (!hfs.containsKey(l)) hfs.put(l, s);
			for (Locale l : s.getSupportedSplitLocales())
				if (!sps.containsKey(l)) sps.put(l, s);
			for (Locale l : s.getSupportedTokenizationLocales())
				if (!ts.containsKey(l)) ts.put(l, s);
		}

	}

	@Override
	public String baseform(String string, Locale lang, boolean markSegments, boolean guessUnknown, int maxEditDistance) {
		if (bfs.containsKey(lang)) return bfs.get(lang).baseform(string, lang, markSegments, guessUnknown, maxEditDistance);
		if (lang != null && !"".equals(lang.getCountry())) {
			lang = new Locale(lang.getLanguage());
			if (bfs.containsKey(lang)) return bfs.get(lang).baseform(string, lang, markSegments, guessUnknown, maxEditDistance);
		}
		return string;
	}

	@Override
	public Collection<Locale> getSupportedBaseformLocales() {
		return bfs.keySet();
	}

	@Override
	public Collection<Locale> getSupportedSummarizeLocales() {
		return ss.keySet();
	}

	@Override
	public String summarize(String string, Locale lang) {
		if (ss.containsKey(lang)) return ss.get(lang).summarize(string, lang);
		if (lang != null && !"".equals(lang.getCountry())) {
			lang = new Locale(lang.getLanguage());
			if (ss.containsKey(lang)) return ss.get(lang).summarize(string, lang);
		}
		return string;
	}

	@Override
	public String hyphenate(String string, Locale lang) {
		if (hfs.containsKey(lang)) return hfs.get(lang).hyphenate(string, lang);
		if (lang != null && !"".equals(lang.getCountry())) {
			lang = new Locale(lang.getLanguage());
			if (hfs.containsKey(lang)) return hfs.get(lang).hyphenate(string, lang);
		}
		return string;
	}

	@Override
	public Collection<Locale> getSupportedHyphenationLocales() {
		return hfs.keySet();
	}

	@Override 
	public String inflect(String string, List<String> inflections, boolean markSegments, boolean baseform, boolean guessUnknown, int maxEditDistance, Locale lang) {
		if (ifs.containsKey(lang)) return ifs.get(lang).inflect(string, inflections, markSegments, baseform, guessUnknown, maxEditDistance, lang);
		if (lang != null && !"".equals(lang.getCountry())) {
			lang = new Locale(lang.getLanguage());
			if (ifs.containsKey(lang)) return ifs.get(lang).inflect(string, inflections, markSegments, baseform, guessUnknown, maxEditDistance, lang);
		}
		return string;
	}

	@Override
	public Collection<Locale> getSupportedInflectionLocales() {
		return ifs.keySet();
	}
	
	@Override
	public Collection<String> split(String string, Locale lang) {
		if (sps.containsKey(lang)) return sps.get(lang).split(string, lang);
		if (lang != null && !"".equals(lang.getCountry())) {
			lang = new Locale(lang.getLanguage());
			if (sps.containsKey(lang)) return sps.get(lang).split(string, lang);
		}
		return Collections.singleton(string);
	}
	
	@Override
	public Collection<Locale> getSupportedSplitLocales() {
		return sps.keySet();
	}

	@Override
	public Collection<String> tokenize(String string, Locale lang) {
		if (ts.containsKey(lang)) return ts.get(lang).tokenize(string, lang);
		if (lang != null && !"".equals(lang.getCountry())) {
			lang = new Locale(lang.getLanguage());
			if (ts.containsKey(lang)) return ts.get(lang).tokenize(string, lang);
		}
		return Collections.singleton(string);
	}
	
	@Override
	public Collection<Locale> getSupportedTokenizationLocales() {
		return ts.keySet();
	}

}
