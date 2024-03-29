DROP TABLE IF EXISTS ITEMS CASCADE;
DROP TABLE IF EXISTS USERS CASCADE;


CREATE TABLE USERS
(
    USER_ID    INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    FIRST_NAME VARCHAR(30) NOT NULL,
    LAST_NAME  VARCHAR(50),
    REGISTRATION_DATE TIMESTAMP,
    STATE VARCHAR(20)
);

CREATE TABLE ITEMS
(
    ITEM_ID INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    USER_ID INTEGER NOT NULL REFERENCES USERS (USER_ID),
    URL     CHARACTER VARYING(255)
);

CREATE TABLE TAGS
(
    TAGS_ID INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    NAME    VARCHAR(30) NOT NULL,
    ITEM_ID INTEGER NOT NULL REFERENCES ITEMS (ITEM_ID)
);