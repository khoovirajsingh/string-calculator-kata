(ns calculator.core
  (:gen-class))
(require '[clojure.string :as str])

(defn parse-numbers [numbers]
  (mapcat #(str/split % #"\n") (str/split numbers #",")))

(defn custom-separators? [input]
  (= '("/" "/") (take 2 (str/split input #""))))

(defn parse-separators [input]
  (let [dropped (drop 2 (str/split input #""))
        separator (first dropped)
        numbers (drop 1 (rest dropped))]
    {:separators separator :numbers (str/join numbers)}))

(defn add [numbers]
  (cond 
    (empty? numbers) 0
    :else (->> numbers
               (parse-numbers)
               (map #(Integer/parseInt %))
               (reduce +))))


