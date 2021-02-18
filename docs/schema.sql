CREATE TABLE users(
     id          VARCHAR NOT NULL PRIMARY KEY
    ,name        VARCHAR NOT NULL
    ,description VARCHAR
    ,secretType  VARCHAR
    ,roles       JSON
);

CREATE TABLE userSecrets(
    userId          VARCHAR(36) NOT NULL PRIMARY KEY
    ,secretType        VARCHAR(13) NOT NULL
    ,value VARCHAR(7)
);
