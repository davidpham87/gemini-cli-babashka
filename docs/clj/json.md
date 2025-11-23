# JSON (org.babashka/json)

## `json/read-str`

**Signature**: `(read-str s) (read-str s options)`

**Docstring**:
Reads a string of JSON data and returns the corresponding Clojure data structure.

**Examples**:

```clojure
;; Example 1: Read a simple JSON object
(json/read-str "{\"a\": 1, \"b\": 2}")
;; Returns: {"a" 1, "b" 2}
```

```clojure
;; Example 2: Read JSON and keywordize keys
(json/read-str "{\"a\": 1}" {:key-fn keyword})
;; Returns: {:a 1}
```

## `json/write-str`

**Signature**: `(write-str x) (write-str x options)`

**Docstring**:
Converts a Clojure data structure to a JSON string.

**Examples**:

```clojure
;; Example 1: Write a map to JSON
(json/write-str {:a 1 :b 2})
;; Returns: "{\"a\":1,\"b\":2}"
```

```clojure
;; Example 2: Write a vector to JSON
(json/write-str [1 2 3])
;; Returns: "[1,2,3]"
```

---
**Source Code**: https://github.com/babashka/babashka.json
