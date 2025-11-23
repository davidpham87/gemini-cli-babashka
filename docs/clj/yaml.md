# YAML (clj-yaml)

## `clj-yaml.core/parse-string`

**Signature**: `(parse-string string)`

**Docstring**:
Parses a YAML string into Clojure data.

**Examples**:

```clojure
;; Example 1: Parse a simple YAML map
(clj-yaml.core/parse-string "foo: bar")
;; Returns: {:foo "bar"}
```

```clojure
;; Example 2: Parse a YAML list
(clj-yaml.core/parse-string "- 1\n- 2")
;; Returns: (1 2)
```

## `clj-yaml.core/generate-string`

**Signature**: `(generate-string data)`

**Docstring**:
Generates a YAML string from Clojure data.

**Examples**:

```clojure
;; Example 1: Generate YAML from a map
(clj-yaml.core/generate-string {:foo "bar"})
;; Returns: "foo: bar\n"
```

```clojure
;; Example 2: Generate YAML from a vector
(clj-yaml.core/generate-string [1 2 3])
;; Returns: "- 1\n- 2\n- 3\n"
```

---
**Source Code**: https://github.com/clj-commons/clj-yaml
