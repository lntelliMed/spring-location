use projectdb

CREATE TABLE document(
id BIGINT NOT NULL,
name VARCHAR(100) NOT NULL,
data BLOB NOT NULL,
PRIMARY KEY (id)
)

-- drop table document
