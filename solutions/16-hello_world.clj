; Write a function which returns a personalized greeting.
;
; http://www.4clojure.com/problem/16

(def solution (fn  [s]  (str  "Hello, " s  "!")))

(= (solution "Dave")  "Hello, Dave!")
(= (solution "Jenn")  "Hello, Jenn!")
(= (solution "Rhea")  "Hello, Rhea!")
