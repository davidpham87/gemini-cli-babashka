# Gemini Cli speaks Clojure/Babashka

LLMs are more efficient if they can henerate their insights by executing code (it is cheaper to exdcute determbistic code). As the size of context/attention is constraints and that we pay the generation per token (roughly words), a language that is succinct and dynamic is more approriate than more verbose alternative. 

Clojure is a great tool for this. Its syntax is extremely simple and succinct.

This repos only focus on custom commands.

* Start a nrepl server at start
* Allow both cold execution of code and local server evaluation
* Adds many defaults libraries for performing typcial data transformation task:
  + Portal
  + malli
  + datascript
  + honeysql
  + data converter between json, yaml and edn
  + html generatiok with hiccup
  + http server and client
  + vega-lite support

