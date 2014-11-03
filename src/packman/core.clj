(ns packman.core
  (:import (jline.console ConsoleReader)
  (:gen-class)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [cr (ConsoleReader.)]
  	(.clearScreen cr))
  (println "Hello, World!"))
