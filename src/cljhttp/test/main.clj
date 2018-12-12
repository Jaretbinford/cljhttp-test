(ns cljhttp.test.main
  (:require
    [clj-http.client :as client]))

;;For this example I lifted the echo function from ion-starter and returned a client/head instead of input.
(defn echo
  "using cljhttp to grab the head from a website"
  [{:keys [context input]}]
  (str (client/head "http://google.com")))

