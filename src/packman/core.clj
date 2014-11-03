(ns packman.core
  (:gen-class)
  (:require [packman.hero :as hero])
  (:import (jline.console ConsoleReader)))

(defn frame
  [func & args]
  (let [cr (ConsoleReader.)]
    (.clearScreen cr))
  (apply func args)
  (Thread/sleep 100))


(defn -main
  "I don't do a whole lot ... yet."
  [& args]

  (dotimes [n 40]
  	(frame hero/draw n 0 -1))

  )
