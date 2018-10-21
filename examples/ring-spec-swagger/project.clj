(defproject ring-example "0.1.0-SNAPSHOT"
  :description "Reitit Ring App with Swagger"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring/ring-jetty-adapter "1.7.0"]
                 [metosin/reitit "0.2.4"]]
  :repl-options {:init-ns example.server})
