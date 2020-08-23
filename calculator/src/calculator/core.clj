(ns calculator.core
  (:gen-class))
(require '[clojure.string :as str])


(defn parse-numbers [numbers]
  (str/split numbers #","))
  

(defn add [numbers]
  (if (empty? numbers) 0
    (->> numbers
         (parse-numbers)
         (map #(Integer/parseInt %))
         (reduce +))))



