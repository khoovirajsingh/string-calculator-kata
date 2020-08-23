(ns calculator.core
  (:gen-class))

(defn add [numbers]
  (if (empty? numbers) 0
    (Integer/parseInt numbers)))


