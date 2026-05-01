/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  CrisbeloNeto
 * Created: 12/03/2026
 */

-- Library Management System REST API Database Schema
-- Database: library-db

-- Para usar a função gen_random_uuid()
CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS authors(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    created_at TIMESTAMP(6) WITHOUT TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP(6) WITHOUT TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS publishers(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS books(
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    isbn VARCHAR(30) UNIQUE NOT NULL,
    title VARCHAR(255) NOT NULL,
    edition_number INT DEFAULT 0,
    copyright_year INT,
    fk_publisher UUID,
    image_url VARCHAR(255),
    CONSTRAINT publisher_fkey FOREIGN KEY (fk_publisher) REFERENCES publishers(id)
);

CREATE TABLE IF NOT EXISTS book_author(
    fk_book UUID NOT NULL,
    fk_author UUID NOT NULL,
    PRIMARY KEY (fk_book, fk_author),
    CONSTRAINT book_fkey FOREIGN KEY(fk_book) REFERENCES books(id) ON DELETE CASCADE,
    CONSTRAINT author_fkey FOREIGN KEY(fk_author) REFERENCES authors(id) ON DELETE CASCADE
);