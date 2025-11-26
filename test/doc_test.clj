(ns doc-test
  (:require [clojure.test :refer :all]
            [doc :as d]))

(deftest doc-and-source-test
  (testing "doc and source for str/join"
    (let [result (d/doc-and-source "str/join")]
      (is (clojure.string/starts-with? result "clojure.string/join"))
      (is (clojure.string/includes? result "[coll]")))))
