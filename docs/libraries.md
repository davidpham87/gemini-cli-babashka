# Available Libraries Overview

This document provides a concise explanation of the libraries available in the Gemini CLI extension and lists their main functions.

## Portal
**Description**: A tool to navigate through your data. It allows you to inspect complex data structures in a UI.
**Main Functions**:
*   `portal.api/open`: Opens the portal UI.
*   `portal.api/tap`: Sends a value to the portal for inspection.
*   `portal.api/clear`: Clears the portal history.

## Malli
**Description**: A data-driven schema library for Clojure/Script. It is used for validation and specification of data.
**Main Functions**:
*   `malli.core/validate`: Validates a value against a schema.
*   `malli.core/explain`: Returns an explanation of why a value is not valid.

## Datascript
**Description**: An immutable in-memory database and Datalog query engine. It runs in the browser and on the JVM.
**Main Functions**:
*   `datascript.core/create-conn`: Creates a new database connection (atom).
*   `datascript.core/transact!`: Transacts data into the database.
*   `datascript.core/q`: Executes a datalog query.
*   `datascript.core/db`: Returns the current database value from a connection.

## HoneySQL
**Description**: A library for turning Clojure data structures into SQL strings.
**Main Functions**:
*   `honey.sql/format`: Formats a Clojure data structure into a SQL string and parameters.

## Data Converters (JSON, YAML, EDN)
**Description**: Utilities for converting between different data formats.

### JSON (`org.babashka/json`)
**Main Functions**:
*   `json/read-str`: Reads a JSON string into Clojure data.
*   `json/write-str`: Writes Clojure data into a JSON string.

### YAML (`clj-yaml`)
**Main Functions**:
*   `clj-yaml.core/parse-string`: Parses a YAML string into Clojure data.
*   `clj-yaml.core/generate-string`: Generates a YAML string from Clojure data.

### EDN (`clojure.edn`)
**Main Functions**:
*   `clojure.edn/read-string`: Reads one object from the string s.

## Hiccup
**Description**: A library for representing HTML in Clojure. It uses vectors to represent elements and maps for attributes.
**Main Functions**:
*   `hiccup.core/html`: Renders Clojure data structures into an HTML string.

## HTTP (`http-kit`)
**Description**: A high-performance, event-driven HTTP client and server.
**Main Functions**:
*   `org.httpkit.client/get`: Issues an asynchronous HTTP GET request.
*   `org.httpkit.client/post`: Issues an asynchronous HTTP POST request.

## Vega-Lite
**Description**: Support for creating Vega-Lite visualizations. This is primarily achieved by generating the appropriate JSON/EDN data structure that conforms to the Vega-Lite specification.
**Main Functions**:
*   No specific library functions. Usage involves constructing the specification map.
