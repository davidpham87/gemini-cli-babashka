(ns example.core-test
  (:require [clojure.test :refer [deftest is testing]]))

(deftest simple-test
  (testing "A simple passing test"
    (is (= 1 1))))
