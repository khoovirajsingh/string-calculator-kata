(ns calculator.core-test
  (:require [clojure.test :refer :all]
            [calculator.core :refer :all]))

(deftest adding-empty-string-returns-zero
    (is (= 0 (add ""))))
