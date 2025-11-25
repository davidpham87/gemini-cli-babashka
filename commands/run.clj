(ns commands.run
  (:require [nrepl.client :as client]
            [nrepl.core :as nrepl]
            [clojure.java.io :as io]))

(defn- get-port []
  (let [port-file (io/file ".nrepl-port")]
    (when (.exists port-file)
      (read-string (slurp port-file)))))

(defn run-code [code]
  (if-let [port (get-port)]
    (with-open [conn (client/connect :port port)]
      (-> (client/client conn 1000)
          (client/message {:op "eval" :code code})
          nrepl/combine-responses
          :value))
    "nREPL server not running."))
