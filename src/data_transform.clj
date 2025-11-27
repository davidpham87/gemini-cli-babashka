(ns data-transform
  (:require [clojure.edn :as edn]
            [sci.core :as sci]))

(defn -main [& args]
  (if (< (count args) 2)
    (println "Usage: bb -m data-transform <data> <function>")
    (try
      (let [data-str (first args)
            func-str (second args)
            data (edn/read-string data-str)
            ;; Evaluate the function string in a safe SCI context.
            func (sci/eval-string func-str)]
        (println (func data)))
      (catch Exception e
        (println (str "Error: " (.getMessage e)))))))
