/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  CrisbeloNeto
 * Created: 12/03/2026
 */

-- Populate tables with data
insert into authors (id, first_name, last_name)
values ('be0ae5d8-3c59-4591-93b2-d01ddab29310', 'Harvey', 'Deitel'),
       ('50025fd4-3562-4eb4-93c6-3fbea6750a1d', 'Paul', 'Deitel'),
       ('bf85ebbf-444d-48b1-9745-1cf21c78b743', 'Tem', 'Nieto'),
       ('a0f305ff-51c2-4277-9033-a0943f7c1849', 'Sean', 'Santry');

insert into publishers (id, name)
values ('9bb6df0d-2627-40aa-b4cb-b78eefb33977', 'Prentice Hall'),
       ('0f3904c6-52bd-4a71-bcc2-218b4881328e', 'Prentice Hall PTG');

insert into books (id, isbn, title, edition_number, copyright_year, fk_publisher)
values ('79fec588-a4aa-4372-82ea-c0a02fd568c1', '0130895725', 'C How to Program', 3, 2001, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('f305d1a6-c6ae-4be6-bf5e-9c046ba9f036', '0132261197', 'C How to Program', 2, 1994, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('9b201f62-1bc9-4739-90da-f9f8c716ea9c', '0130895717', 'C++ How to Program', 3, 2001, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('8c4f1a06-87c2-4d99-b4f6-413471e9162f', '0135289106', 'C++ How to Program', 2, 1998, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('9e44eeab-def1-4ef5-903f-307c8322ba56', '0139163050', 'The Complete C++ Training Course', 3, 2001, '0f3904c6-52bd-4a71-bcc2-218b4881328e'),
       ('79af46e8-6321-4a07-8f30-c55920c0c6c7', '013028419x', 'e-Business and e-Commerce How to Program', 1, 2001, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('34888e69-612d-457a-9dd8-6467db08f951', '0130161438', 'Internet and World Wide How to Program', 1, 2000, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('8fe157db-1074-4845-8004-816ed15f501e', '0130856118', 'The Complete Internet and World Wide Web Programming Training Course', 1, 2000, '0f3904c6-52bd-4a71-bcc2-218b4881328e'),
       ('c615c33c-6b04-4b24-8096-e983153cf9f5', '0130125075', 'Java How to Program (Java 2)', 3, 2000, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('940cc4ea-f792-4127-9ca8-11a97849db0c', '0138993947', 'Java How to Program (Java 1.1)', 2, 1998, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('94ba4d78-7107-4688-aced-4392f5005e27', '0130852473', 'The Complete Java 2 Training Course', 3, 2000, '0f3904c6-52bd-4a71-bcc2-218b4881328e'),
       ('8b08ba9d-f762-4ac7-8815-08297f6d832d', '0130829277', 'The Complete Java Training Course (Java 1.1)', 2, 1998, '0f3904c6-52bd-4a71-bcc2-218b4881328e'),
       ('c5a36782-43a5-4b11-b782-10e12a7308af', '0134569555', 'Visual Basic 6 How to Program', 1, 1999, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('9529dca6-0471-4016-a3d0-9aa1da09774f', '0130829293', 'The Complete Visual Basic 6 Training Course', 1, 1999, '0f3904c6-52bd-4a71-bcc2-218b4881328e'),
       ('743eff9c-fc1c-4889-b7dd-29a902262086', '0130284173', 'XML How to Program', 1, 2001, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('87473c7a-193e-4ecd-8f3a-a3ddb3fd94f6', '0130284181', 'Pearl How to Program', 1, 2001, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('d7be87ed-3070-4e42-bff9-2c8bf2d19bef', '0130895601', 'Advanced Java 2 Platform How to Program', 1, 2002, '9bb6df0d-2627-40aa-b4cb-b78eefb33977');

insert into book_author (fk_book, fk_author)
values ('79fec588-a4aa-4372-82ea-c0a02fd568c1', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('f305d1a6-c6ae-4be6-bf5e-9c046ba9f036', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('9b201f62-1bc9-4739-90da-f9f8c716ea9c', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('8c4f1a06-87c2-4d99-b4f6-413471e9162f', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('9e44eeab-def1-4ef5-903f-307c8322ba56', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('79af46e8-6321-4a07-8f30-c55920c0c6c7', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('34888e69-612d-457a-9dd8-6467db08f951', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('8fe157db-1074-4845-8004-816ed15f501e', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('c615c33c-6b04-4b24-8096-e983153cf9f5', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('940cc4ea-f792-4127-9ca8-11a97849db0c', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('94ba4d78-7107-4688-aced-4392f5005e27', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('8b08ba9d-f762-4ac7-8815-08297f6d832d', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('c5a36782-43a5-4b11-b782-10e12a7308af', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('9529dca6-0471-4016-a3d0-9aa1da09774f', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('743eff9c-fc1c-4889-b7dd-29a902262086', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('87473c7a-193e-4ecd-8f3a-a3ddb3fd94f6', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('d7be87ed-3070-4e42-bff9-2c8bf2d19bef', 'be0ae5d8-3c59-4591-93b2-d01ddab29310'),
       ('79fec588-a4aa-4372-82ea-c0a02fd568c1', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('f305d1a6-c6ae-4be6-bf5e-9c046ba9f036', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('9b201f62-1bc9-4739-90da-f9f8c716ea9c', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('8c4f1a06-87c2-4d99-b4f6-413471e9162f', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('9e44eeab-def1-4ef5-903f-307c8322ba56', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('79af46e8-6321-4a07-8f30-c55920c0c6c7', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('34888e69-612d-457a-9dd8-6467db08f951', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('8fe157db-1074-4845-8004-816ed15f501e', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('c615c33c-6b04-4b24-8096-e983153cf9f5', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('940cc4ea-f792-4127-9ca8-11a97849db0c', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('94ba4d78-7107-4688-aced-4392f5005e27', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('8b08ba9d-f762-4ac7-8815-08297f6d832d', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('c5a36782-43a5-4b11-b782-10e12a7308af', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('9529dca6-0471-4016-a3d0-9aa1da09774f', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('743eff9c-fc1c-4889-b7dd-29a902262086', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('87473c7a-193e-4ecd-8f3a-a3ddb3fd94f6', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('d7be87ed-3070-4e42-bff9-2c8bf2d19bef', '50025fd4-3562-4eb4-93c6-3fbea6750a1d'),
       ('79af46e8-6321-4a07-8f30-c55920c0c6c7', 'bf85ebbf-444d-48b1-9745-1cf21c78b743'),
       ('34888e69-612d-457a-9dd8-6467db08f951', 'bf85ebbf-444d-48b1-9745-1cf21c78b743'),
       ('8fe157db-1074-4845-8004-816ed15f501e', 'bf85ebbf-444d-48b1-9745-1cf21c78b743'),
       ('c5a36782-43a5-4b11-b782-10e12a7308af', 'bf85ebbf-444d-48b1-9745-1cf21c78b743'),
       ('9529dca6-0471-4016-a3d0-9aa1da09774f', 'bf85ebbf-444d-48b1-9745-1cf21c78b743'),
       ('743eff9c-fc1c-4889-b7dd-29a902262086', 'bf85ebbf-444d-48b1-9745-1cf21c78b743'),
       ('87473c7a-193e-4ecd-8f3a-a3ddb3fd94f6', 'bf85ebbf-444d-48b1-9745-1cf21c78b743'),
       ('d7be87ed-3070-4e42-bff9-2c8bf2d19bef', 'a0f305ff-51c2-4277-9033-a0943f7c1849');