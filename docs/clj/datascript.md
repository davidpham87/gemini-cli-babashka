# Datascript

## `datascript.core/create-conn`

**Signature**: `(create-conn) (create-conn schema)`

**Docstring**:
Creates a new connection to an in-memory database. Returns an atom containing the database state.

**Examples**:

```clojure
;; Example 1: Create a connection without schema
(datascript.core/create-conn)
;; Returns: #object[clojure.lang.Atom ...]
```

```clojure
;; Example 2: Create a connection with schema
(datascript.core/create-conn {:person/name {:db/unique :db.unique/identity}})
;; Returns: #object[clojure.lang.Atom ...]
```

## `datascript.core/transact!`

**Signature**: `(transact! conn tx-data)`

**Docstring**:
Transacts data into the database. Returns a report of the transaction.

**Examples**:

```clojure
;; Example 1: Add a new entity
(def conn (datascript.core/create-conn))
(datascript.core/transact! conn [{:db/id -1 :name "Ivan"}])
;; Returns: {:db-before ..., :db-after ..., :tx-data ...}
```

```clojure
;; Example 2: Update an attribute
(datascript.core/transact! conn [{:db/id 1 :name "Oleg"}])
;; Returns: {:db-before ..., :db-after ..., :tx-data ...}
```

## `datascript.core/q`

**Signature**: `(q query & inputs)`

**Docstring**:
Executes a Datalog query against the database.

**Examples**:

```clojure
;; Example 1: Query all entity IDs
(datascript.core/q '[:find ?e :where [?e :name]] @conn)
;; Returns: #{[1] [2]}
```

```clojure
;; Example 2: Query with parameter
(datascript.core/q '[:find ?e :in $ ?n :where [?e :name ?n]] @conn "Ivan")
;; Returns: #{[1]}
```

## `datascript.core/db`

**Signature**: `(db conn)`

**Docstring**:
Returns the current database value from a connection.

**Examples**:

```clojure
;; Example 1: Get DB from connection atom
(datascript.core/db conn)
;; Returns: #datascript.db.DB {...}
```

```clojure
;; Example 2: Use DB in a query (implied)
(datascript.core/q '[:find ?e :where [?e :name]] (datascript.core/db conn))
;; Returns: #{[1]}
```

---
**Source Code**: https://github.com/tonsky/datascript
