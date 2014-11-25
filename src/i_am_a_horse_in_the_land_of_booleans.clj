(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean[value]
  (if (= value nil) false
  (if (= value false) false true)))

(defn abs [value]
  (if(< value 0) (* -1 value) value))

(defn divides? [divisor num]
  (if (= (mod num divisor) 0) true false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else         ""))

(defn teen? [age]
  (if(<= age 19)
    (if (>= age 13) true false)
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (list? x ) (* 2 (count x))
   (vector? x ) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
   (not (divides? 4 year)) false
   (not (divides? 100 year)) true
   (not (divides? 400 year)) false
   :else true))

; '_______'
