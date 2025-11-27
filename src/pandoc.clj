(ns pandoc-convert
  (:require [babashka.process :as p]
            [clojure.string :as str]))

(defn -list-input-formats []
  (let [{:keys [out err exit]} @(p/process ["pandoc" "--list-input-formats"])]
    (if (zero? exit)
      (println out)
      (println (str "Error: " err)))))

(defn -list-output-formats []
  (let [{:keys [out err exit]} @(p/process ["pandoc" "--list-output-formats"])]
    (if (zero? exit)
      (println out)
      (println (str "Error: " err)))))

(defn -main [& args]
  (cond
    (= (first args) "--list-input-formats")
    (-list-input-formats)

    (= (first args) "--list-output-formats")
    (-list-output-formats)

    (< (count args) 3)
    (println "Usage: bb -m pandoc-convert <input-format> <output-format> <data>")

    :else
    (let [input-format (first args)
          output-format (second args)
          data (str/join " " (drop 2 args))
          {:keys [out err exit]} @(p/process ["pandoc" "-f" input-format "-t" output-format] {:in data})]
      (if (zero? exit)
        (println out)
        (println (str "Error: " err))))))
