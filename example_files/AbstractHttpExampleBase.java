package at.cgsit.training.examples.http.a001_http;

import java.net.URI;
import java.net.http.HttpClient;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class AbstractHttpExampleBase {

  protected static final HttpClient CLIENT = HttpClient.newBuilder().build();

  protected static final String SEARCH_TERM = "Java";

  protected static final List<URI> SEARCH_URLS = Stream.of(
      "https://de.wikipedia.org/wiki/Java_(Programmiersprache)",
      "https://de.wikipedia.org/wiki/Python_(Programmiersprache)",
      "https://de.wikipedia.org/wiki/Perl_(Programmiersprache)",
      "https://de.wikipedia.org/wiki/Java_Platform,_Enterprise_Edition"
  ).map(URI::create).collect(toList());

}
