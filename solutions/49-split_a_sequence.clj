; Write a function which will split a sequence into two parts.
;
; http://www.4clojure.com/problem/49


(defn split-sequence [n xs]
  (vec (map vec [(take n xs) (drop n xs)])))

(= (split-sequence 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]])
(= (split-sequence 1 [:a :b :c :d]) [[:a] [:b :c :d]])
(= (split-sequence 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]])
