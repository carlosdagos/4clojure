; Write a function which takes a string and returns a new string containing
; only the capital letters.
;
; http://www.4clojure.com/problem/29

(fn get-caps [xs]
  (apply str (re-seq #"[A-Z]" xs)))

(= (get-caps "HeLlO, WoRlD!")  "HLOWRD")
(empty?  (get-caps "nothing"))
(= (get-caps "$#A(*&987Zf")  "AZ")

