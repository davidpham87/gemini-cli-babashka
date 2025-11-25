(ns gemini.nrepl-test
  (:require [clojure.test :refer [deftest is testing use-fixtures]]
            [gemini.nrepl :as nrepl]
            [commands.run :as run]
            [tool-discovery :as discovery]))

(defn repl-fixture [f]
  (nrepl/start!)
  (f)
  (nrepl/stop!))

(use-fixtures :each repl-fixture)

(deftest code-execution-test
  (testing "Code execution"
    (is (= "2" (run/run-code "(+ 1 1)")))))

(deftest tool-discovery-test
  (testing "Tool discovery"
    (run/run-code "(require 'tool-discovery)")
    (is (= "\"Namespace my-test-namespace created.\"" (run/run-code "(tool-discovery/create-namespace 'my-test-namespace)")))
    (is (.contains (run/run-code "(str (tool-discovery/list-publics 'my-test-namespace))") "()"))
    (is (.contains (run/run-code "(tool-discovery/function-doc 'clojure.core 'map)") "map"))))
