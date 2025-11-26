(ns doc)

(require '[clojure.repl :as repl])
(require '[clojure.string :as str])

(defn get-doc [sym]
  (try
    (with-out-str (repl/doc (symbol sym)))
    (catch Exception e
      (str "Error getting doc for " sym ": " (.getMessage e)))))

(defn get-source [sym]
  (try
    (with-out-str (repl/source (symbol sym)))
    (catch Exception e
      (str "Error getting source for " sym ": " (.getMessage e)))))

(defn doc-and-source [sym]
  (str
    (get-doc sym)
    "\n\n"
    (get-source sym)))

(defn -main [& args]
  (if-let [sym (first args)]
    (println (doc-and-source sym))
    (println "Usage: /clj:bb:doc <symbol>")))
