USE motorph;

SELECT * FROM login;

UPDATE login
SET
EmployeeID = 1
WHERE userID = 1;

UPDATE login
SET
EmployeeID = 2,
username = 'Lim02',
password = '2022Lim'
WHERE userID = 2;

UPDATE login
SET
EmployeeID = 3,
username = 'Aquino03',
password = '2022Aquino'
WHERE userID = 3;

UPDATE login
SET
EmployeeID = 4,
username = 'Reyes04',
password = '2022Reyes'
WHERE userID = 4;
UPDATE login
SET
EmployeeID = 5,
username = 'Hernandez05',
password = '2022Hernandez'
WHERE userID = 5;
SELECT * FROM login;

INSERT INTO login VALUES
(6, 6, 'Villanueva06', '2022Villanueva', 'Admin');

INSERT INTO login VALUES
(7, 7,	'SanJose07',	'2022SanJose',	'Admin'),
(8, 8,	'Romualdez08',	'2022Romualdez',	'Admin'),
(9,9,	'Atienza09',	'2022Atienza',	'Admin'),
(10, 10,	'Alvaro10',	'2022Alvaro',	'Admin'),
(11, 11,	'Salcedo11',	'2022Salcedo',	'Admin'),
(12, 12,	'Lopez12',	'2022Lopez',	'Admin'),
(13, 13,	'Farala13',	'2022Farala',	'Non-Admin'),
(14, 14,	'Martinez14',	'2022Martinez',	'Non-Admin');

SELECT * FROM login;

INSERT INTO login VALUES
(15, 15,	'Romualdez15',	'2022Romualdez',	'Admin'),
(16, 16,	'Mata16',	'2022Mata',	'Admin'),
(17, 17,	'DeLeon17',	'2022DeLeon',	'Admin'),
(18, 18,	'SanJose18',	'2022SanJose',	'Non-Admin'),
(19, 19,	'Rosario19',	'2022Rosario',	'Non-Admin'),
(20, 20,	'Bautista20',	'2022Bautista',	'Non-Admin'),
(21, 21,	'Lazaro21',	'2022Lazaro',	'Non-Admin'),
(22, 22,	'DelosSantos22',	'2022DelosSantos',	'Non-Admin'),
(23, 23,	'Santos23',	'2022Santos',	'Non-Admin'),
(24, 24,	'DelRosario24',	'2022DelRosario',	'Non-Admin'),
(25, 25,	'Tolentino25',	'2022Tolentino',	'Non-Admin'),
(26, 26,	'Gutierrez26',	'2022Gutierrez',	'Non-Admin'),
(27, 27,	'Manalaysay27',	'2022Manalaysay',	'Non-Admin'),
(28, 28,	'Villegas28',	'2022Villegas',	'Non-Admin'),
(29, 29,	'Ramos29',	'2022Ramos',	'Non-Admin'),
(30, 30,	'Maceda30',	'2022Maceda',	'Non-Admin'),
(31, 31,	'Aguilar31',	'2022Aguilar',	'Non-Admin'),
(32, 32,	'Castro32',	'2022Castro',	'Non-Admin'),
(33, 33,	'Martinez33',	'2022Martinez',	'Non-Admin'),
(34, 34,	'Santos34',	'2022Santos',	'Non-Admin');