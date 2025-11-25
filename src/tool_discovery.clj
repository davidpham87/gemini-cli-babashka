(ns tool-discovery)

(defn create-namespace
  "Creates a new namespace.
  Usage: (create-namespace 'my-new-namespace)"
  [ns-name]
  (create-ns ns-name)
  (str "Namespace " ns-name " created."))

(defn list-publics
  "Lists the public vars in a namespace.
  Usage: (list-publics 'clojure.core)"
  [ns-name]
  (require ns-name)
  (keys (ns-publics ns-name)))

(defn function-doc
  "Gets the documentation for a function in a namespace.
  Usage: (function-doc 'clojure.core 'map)"
  [ns-name fn-name]
  (require ns-name)
  (let [v (ns-resolve ns-name fn-name)]
    (when v
      (-> v meta :doc))))
