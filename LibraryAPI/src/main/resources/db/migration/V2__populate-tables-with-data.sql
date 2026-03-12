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
values ('79fec588-a4aa-4372-82ea-c0a02fd568c1', '0130895725', 'C How To Program', 3, 2001, '9bb6df0d-2627-40aa-b4cb-b78eefb33977'),
       ('f305d1a6-c6ae-4be6-bf5e-9c046ba9f036', '0132261197', 'C How To Program', 2, 1994, '9bb6df0d-2627-40aa-b4cb-b78eefb33977');