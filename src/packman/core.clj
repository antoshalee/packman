(ns packman.core
  (:gen-class)
  (:require [packman.hero :as hero])
  (:import (jline.console ConsoleReader)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [cr (ConsoleReader.)]
  	(.clearScreen cr))
  (hero/draw 0 0 -1))
