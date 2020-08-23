(ns calculator.core-test
  (:require [clojure.test :refer :all]
            [calculator.core :refer :all]))

(deftest adding-empty-string-returns-zero
    (is (= 0 (add ""))))

(deftest adding-a-string-number-returns-number
    (is (= 1 (add "1"))))

(deftest adding-2-string-numbers-separated-by-comma-returns-sum-of-numbers
    (is (= 3 (add "1,2"))))
