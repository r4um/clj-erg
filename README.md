# clj-erg [![Build Status](https://travis-ci.org/r4um/clj-erg.svg)](https://travis-ci.org/r4um/clj-erg)

Clojure [grange](https://github.com/square/grange-server) client library.

## Leiningen

[![Dependencies Status](https://versions.deps.co/r4um/clj-erg/status.svg)](https://versions.deps.co/r4um/clj-erg)
[![leiningen version](http://clojars.org/erg/latest-version.svg)](http://clojars.org/erg)

## Usage

```clojure
user=> (require '[erg.core :as e])
nil
user=> (e/expand "test1..3" :range-server "127.0.0.1")
["test1" "test2" "test3"]
```

## License

Copyright © Pranay Kanwar

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
