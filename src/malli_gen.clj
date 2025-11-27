(ns malli-gen
  (:require [malli.core :as m]
            [malli.generator :as mg]
            [clojure.edn :as edn]))

(defn -main [& args]
  (if (empty? args)
    (println "Usage: bb -m malli-gen <schema>")
    (let [schema-str (first args)
          schema (edn/read-string schema-str)]
      (println (mg/generate schema)))))
