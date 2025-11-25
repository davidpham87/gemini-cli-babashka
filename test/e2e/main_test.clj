(ns e2e.main-test
  (:require [clojure.test :refer [deftest is testing]]
            [clojure.java.shell :as shell]
            [clojure.string :as str]))

(deftest execute-command-test
  (testing "Testing /clj:bb:execute command"
    (let [result (shell/sh "bash" "-c" "gemini -p \\"/clj:bb:execute '(+ 1 1)'\\"")]
      (is (= 0 (:exit result)))
      (is (str/includes? (:out result) "2")))))
