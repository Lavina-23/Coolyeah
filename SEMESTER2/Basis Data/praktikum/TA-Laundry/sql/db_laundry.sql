USE db_laundry;

-- kering 2kg
-- setrika 3kg
SELECT * FROM tb_paket

INSERT INTO tb_transaksi VALUES
  ('TR003', 'KS002', 'CS002', 'Belum Diambil', '2024-06-14')

INSERT INTO tb_detail_transaksi (id_trans, id_paket, berat) VALUES
("TR003", "PK001", 2),
("TR003", "PK002", 3)

SELECT * FROM tb_transaksi;

SELECT * FROM tb_detail_transaksi;

SELECT c.nama_cust, p.nama_paket
FROM tb_transaksi t
  INNER JOIN tb_customer c WHERE t.id_cust = c.id_cust
  INNER JOIN tb_detail_transaksi dt WHERE t.id_trans = dt.id_trans
  INNER JOIN tb_paket p WHERE dt.id_paket = p.id_paket;