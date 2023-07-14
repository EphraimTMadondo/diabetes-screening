-- noinspection SqlDialectInspectionForFile
-- noinspection SqlNoDataSourceInspectionForFile
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');

INSERT INTO patients(national_identification_number, full_name, gender, date_of_birth) VALUES
	('42-267619N42', 'Ephraim Madondo', 'MALE','1995-01-01 00:00:00'),
	('43-267619M42', 'TestUser Patient', 'MALE','1995-01-01 00:00:00');