{:user
 {:jvm-opts ["-Dapple.awt.UIElement=true"]          ; this doesn't work, LEIN_JVM_OPTS env variable works though.
 :plugins [[cider/cider-nrepl "0.8.1"]              ; repl for vim-fireplace
           [lein-pprint "1.1.1"]                    ; pretty prints stuff, like 'lein with-profile user pprint'
           [lein-exec "0.3.4"]                      ; execute clojure programs as shell scripting
           ]}}
