-- Active: 1714393152209@@127.0.0.1@3306@db_laundry
USE db_laundry;

-- tabel: kasir, transaksi,paket
CREATE TABLE tb_customer (
  id_cust VARCHAR (5) NOT NULL PRIMARY KEY,
  nama_cust VARCHAR (30),
  jenis_kelamin ENUM ('P', 'L'),
  no_telp VARCHAR (15),
  alamat VARCHAR (150)
)

CREATE TABLE tb_kasir (
  id_kasir VARCHAR (5) NOT NULL PRIMARY KEY,
  nama_kasir VARCHAR (30),
  jenis_kelamin ENUM ('P', 'L'),
  no_telp VARCHAR (15)
)

CREATE TABLE tb_paket (
  id_paket VARCHAR (5) NOT NULL PRIMARY KEY,
  nama_paket VARCHAR (25),
  harga INT
)

CREATE TABLE tb_transaksi (
  id_trans VARCHAR (5) NOT NULL PRIMARY KEY,
  id_kasir VARCHAR (5),
  id_cust VARCHAR (5),
  stats ENUM ('Sudah Diambil', 'Belum Diambil'),
  tgl_trans DATE,
  FOREIGN KEY (id_kasir) REFERENCES tb_kasir(id_kasir),
  FOREIGN KEY (id_cust) REFERENCES tb_customer(id_cust)
)

CREATE TABLE tb_detail_transaksi (
  id_det INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  id_trans VARCHAR (5),
  id_paket VARCHAR (5),
  berat INT,
  FOREIGN KEY (id_trans) REFERENCES tb_transaksi(id_trans),
  FOREIGN KEY (id_paket) REFERENCES tb_paket(id_paket)
)

SHOW TABLES;

INSERT INTO tb_customer VALUES 
  ('CS001', 'Lavina', 'P', '08213657890', 'Losawi'),
  ('CS002', 'Deanissa', 'P', '08912345678', 'Losari'),
  ('CS003', 'Revani', 'P', '08173772718', 'Sawojajar')


INSERT INTO tb_kasir VALUES 
  ('KS001', 'Seokjin', 'L', '081253678921'),
  ('KS002', 'Go Eun', 'P', '087465123443'),
  ('KS003', 'Jungkook', 'L', '082631234567')


INSERT INTO tb_paket VALUES
  ('PK001', 'Cuci Kering', 5000),
  ('PK002', 'Cuci Kering Setrika', 7000)

INSERT INTO tb_transaksi VALUES
  ('TR001', 'KS002', 'CS002', 'Sudah Diambil', '2023-11-29'),
  ('TR002', 'KS003', 'CS001', 'Belum Diambil', '2023-01-19')

INSERT INTO tb_detail_transaksi (id_trans, id_paket, berat) VALUES
  ('TR001', 'PK001', 2),
  ('TR001', 'PK002', 6),
  ('TR002', 'PK002', 4)

SELECT
  dt.id_det,
  c.nama_cust,
  p.nama_paket,
  (dt.berat * p.harga) AS subtotal
  FROM tb_detail_transaksi dt
    INNER JOIN tb_transaksi t ON dt.id_trans = t.id_trans
    INNER JOIN tb_customer c ON t.id_cust = c.id_cust
    INNER JOIN tb_paket p ON dt.id_paket = p.id_paket;

SELECT
  dt.id_trans,
  t.tgl_trans,
  k.nama_kasir,
  c.nama_cust,
  t.stats,
  SUM(dt.berat * p.harga) AS total
  FROM tb_detail_transaksi dt
    INNER JOIN tb_transaksi t ON dt.id_trans = t.id_trans
    INNER JOIN tb_paket p ON dt.id_paket = p.id_paket
    INNER JOIN tb_customer c ON t.id_cust = c.id_cust
    INNER JOIN tb_kasir k ON t.id_kasir = k.id_kasir
GROUP BY dt.id_trans;