# HTTP (http-kit)

## `org.httpkit.client/get`

**Signature**: `(get url) (get url opts) (get url opts callback)`

**Docstring**:
Issues an asynchronous HTTP GET request. Returns a promise object to which the result of the request will be delivered.

**Examples**:

```clojure
;; Example 1: Simple GET request (dereferencing the promise)
@(org.httpkit.client/get "http://example.com")
;; Returns: {:status 200, :headers {...}, :body "..."}
```

```clojure
;; Example 2: GET with options
@(org.httpkit.client/get "http://example.com" {:query-params {:q "foo"}})
;; Returns: {:status 200, :headers {...}, :body "..."}
```

## `org.httpkit.client/post`

**Signature**: `(post url) (post url opts) (post url opts callback)`

**Docstring**:
Issues an asynchronous HTTP POST request. Returns a promise object to which the result of the request will be delivered.

**Examples**:

```clojure
;; Example 1: POST with body
@(org.httpkit.client/post "http://example.com" {:body "data"})
;; Returns: {:status 200, :headers {...}, :body "..."}
```

```clojure
;; Example 2: POST JSON
@(org.httpkit.client/post "http://example.com/api"
                          {:headers {"Content-Type" "application/json"}
                           :body "{\"key\":\"value\"}"})
;; Returns: {:status 200, :headers {...}, :body "..."}
```

---
**Source Code**: https://github.com/http-kit/http-kit
