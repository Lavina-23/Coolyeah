-- Active: 1714393152209@@127.0.0.1@3306@percobaan_join
USE percobaan_join;

SHOW TABLES;

SELECT * FROM jp;

SELECT kelas.nama_kelas, prodi.nama_prodi
    FROM kelas
    INNER JOIN prodi
    ON kelas.kode_prodi = prodi.kode_prodi;

SELECT k.nama_kelas, p.nama_prodi 
    FROM kelas k INNER JOIN prodi p
    ON p.kode_prodi = k.kode_prodi;

SELECT 
    j.kode_jadwal,
    d.nama_dosen,
    k.nama_kelas,
    h.nama_hari
    FROM jadwal j
        INNER JOIN dosen d ON d.kode_dosen = j.kode_dosen
        INNER JOIN kelas k ON k.kode_kelas = j.kode_kelas
        INNER JOIN hari h ON h.kode_hari = j.kode_hari;

SELECT k.nama_kelas, p.nama_prodi
    FROM kelas k
        INNER JOIN prodi p ON p.kode_prodi = k.kode_prodi
    WHERE k.nama_kelas LIKE '%A';

SELECT 
    k.nama_kelas,
    p.nama_prodi
FROM kelas k LEFT OUTER JOIN prodi p
    ON k.kode_prodi = p.kode_prodi;

SELECT 
    k.nama_kelas,
    p.nama_prodi
FROM kelas k LEFT OUTER JOIN prodi p
    ON k.kode_prodi = p.kode_prodi
WHERE p.kode_prodi IS NULL;

SELECT 
    k.nama_kelas,
    p.nama_prodi
FROM kelas k RIGHT OUTER JOIN prodi p
    ON p.kode_prodi = k.kode_prodi;

SELECT k.nama_kelas, p.nama_prodi
    FROM kelas k LEFT OUTER JOIN prodi p
    ON k.kode_prodi = p.kode_prodi
UNION ALL
SELECT k.nama_kelas, p.nama_prodi
    FROM kelas k RIGHT OUTER JOIN prodi p
    ON p.kode_prodi = k.kode_prodi;

SELECT kelas.nama_kelas, prodi.nama_prodi
    FROM kelas, prodi
    WHERE kelas.kode_prodi = prodi.kode_prodi;

SELECT k.nama_kelas, p.nama_prodi
    FROM kelas k, prodi p
    WHERE k.kode_prodi = p.kode_prodi;

SELECT k.nama_kelas, p.nama_prodi
    FROM kelas k CROSS JOIN prodi p;

SELECT k.nama_kelas, p.nama_prodi
    FROM kelas k, prodi p;

SELECT DISTINCT 
    d.nama_dosen AS 'Dosen Pengampu', 
    mk.nama_mk AS 'Nama Mata Kuliah'
FROM jadwal j
    INNER JOIN dosen d ON j.kode_dosen = d.kode_dosen
    INNER JOIN mk ON j.kode_mk = mk.kode_mk
    ORDER BY d.nama_dosen ASC;

SELECT
    r.kode_ruang AS 'Kode Ruang',
    r.nama_ruang AS 'Nama Ruang',
    h.nama_hari AS 'Hari Dipakai',
    jp.jp_mulai AS 'Dari Jam',
    pj.`jp_Selesai` AS 'Sampai Jam'
FROM jadwal j
    INNER JOIN ruang r ON r.kode_ruang = j.kode_ruang
    INNER JOIN jp ON jp.kode_jp = j.jp_mulai
    INNER JOIN jp pj ON pj.kode_jp = j.jp_selesai
    INNER JOIN hari h ON h.kode_hari = j.kode_hari
    WHERE j.kode_hari = 002;

SELECT 
    d.nama_dosen AS 'Nama Dosen',
    j.kode_jadwal AS 'Kode Jadwal'
FROM jadwal j RIGHT JOIN dosen d
ON d.kode_dosen = j.kode_dosen
WHERE kode_jadwal IS NULL;

SELECT DISTINCT
    mk.nama_mk AS 'Mata Kuliah',
    d.nama_dosen AS 'Pengampu'
FROM jadwal j
    RIGHT JOIN dosen d ON j.kode_dosen = d.kode_dosen
    RIGHT JOIN mk ON j.kode_mk = mk.kode_mk;

SELECT d.nama_dosen AS 'nama_dosen', COUNT(j.kode_dosen) AS 'jumlah_jadwal_mengajar'
    FROM dosen d
    LEFT JOIN jadwal j ON d.kode_dosen = j.kode_dosen
    GROUP BY d.nama_dosen
    ORDER BY jumlah_jadwal_mengajar DESC;

SELECT * FROM jadwal;