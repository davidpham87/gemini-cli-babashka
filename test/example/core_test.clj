(ns example.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [example.core :as sut]))

(deftest add-test
  (testing "Add two numbers"
    (is (= 3 (sut/add 1 2)))))
