# HoneySQL

## `honey.sql/format`

**Signature**: `(format data) (format data options)`

**Docstring**:
Turn the data structure into a SQL string and a vector of parameters.

**Examples**:

```clojure
;; Example 1: Simple SELECT
(honey.sql/format {:select [:*] :from [:table]})
;; Returns: ["SELECT * FROM table"]
```

```clojure
;; Example 2: SELECT with WHERE clause and parameters
(honey.sql/format {:select [:id :name] :from [:users] :where [:= :id 1]})
;; Returns: ["SELECT id, name FROM users WHERE id = ?" 1]
```

---
**Source Code**: https://github.com/seancorfield/honeysql
