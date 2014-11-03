(ns packman.hero)

(def lines [
    "  @@@@ "
    " @@@@@@"
    "@@@@@ @@"
    "@@@@@@@@@"
    "@@@@@@@"
    " @@@@"
    " @@@@@@"
    "  @@@@@@"
  ])

(defn draw
  "TODO: description"
  [x, y, dir]
  (doseq
    [line lines]
    (dotimes [i x]
      (print "  "))
    (println line))
  )
