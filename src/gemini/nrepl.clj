(ns gemini.nrepl
  (:require [nrepl.server :as nrepl-server]
            [cider.nrepl :as cider-nrepl]
            [clojure.java.io :as io]))

(defonce server (atom nil))

(defn start! []
  (when (nil? @server)
    (let [new-server (nrepl-server/start-server
                       :port 0
                       :handler cider-nrepl/cider-nrepl-handler)]
      (spit ".nrepl-port" (str (:port new-server)))
      (reset! server new-server))))

(defn stop! []
  (when-let [s @server]
    (nrepl-server/stop-server s)
    (reset! server nil)
    (let [port-file (io/file ".nrepl-port")]
      (when (.exists port-file)
        (.delete port-file)))))

(defn restart! []
  (stop!)
  (start!))
