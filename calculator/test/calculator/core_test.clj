(ns calculator.core-test
  (:require [clojure.test :refer :all]
            [calculator.core :refer :all]))

(deftest add-string-numbers
  (are [x] (= x)
     0 (add "")
     1 (add "1")
     3 (add "1,2")
    45 (add "1,2,3,4,5,6,7,8,9")
     6 (add "1\n2,3")
     3 (add "//;\n1;2")))

(deftest check-for-custom-separators
  (is (= true (custom-separators? "//;\n1;2"))))

(deftest parse-custom-separators
  (is (= {:separators ";" :numbers "1;2"} (parse-separators "//;\n1;2"))))
