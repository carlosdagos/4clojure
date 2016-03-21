; Clojure strings are Java strings. 
; This means that you can use any of the Java string 
; methods on Clojure strings.
;
; http://www.4clojure.com/problem/3

(def solution "HELLO WORLD")
(= solution (.toUpperCase "hello world"))
