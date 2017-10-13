

CREATE TABLE users (
  id BIGINT AUTO_INCREMENT,
  username VARCHAR(100),
  PASSWORD VARCHAR(100),
  password_salt VARCHAR(100),
  CONSTRAINT pk_users PRIMARY KEY(id)
) ;

CREATE TABLE user_roles(
  id BIGINT AUTO_INCREMENT,
  username VARCHAR(100),
  role_name VARCHAR(100),
  CONSTRAINT pk_user_roles PRIMARY KEY(id)
);

CREATE TABLE roles_permissions(
  id BIGINT AUTO_INCREMENT,
  role_name VARCHAR(100),
  permission VARCHAR(100),
  CONSTRAINT pk_roles_permissions PRIMARY KEY(id)
) ;

INSERT INTO users(username,PASSWORD)VALUES('zhang','123');