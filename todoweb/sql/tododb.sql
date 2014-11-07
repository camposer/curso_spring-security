DROP TABLE authorities;
DROP TABLE users;

CREATE TABLE users(
	username VARCHAR(50) NOT NULL,
	password VARCHAR(100) NOT NULL,
	enabled BOOLEAN NOT NULL,
	PRIMARY KEY (username)
);

CREATE TABLE authorities(
	username VARCHAR(50) NOT NULL,
	authority VARCHAR(50) NOT NULL,
	PRIMARY KEY (username, authority),
	FOREIGN KEY (username) REFERENCES users(username)
);

INSERT INTO users VALUES('admin', 'admin', true);
INSERT INTO authorities VALUES('admin', 'ROLE_ADMIN');