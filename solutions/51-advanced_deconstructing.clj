; http://www.4clojure.com/problem/51

(def solution [1 2 3 4 5])

(= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] solution] [a b c d]))
