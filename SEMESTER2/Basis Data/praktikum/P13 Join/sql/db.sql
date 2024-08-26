-- Active: 1714393152209@@127.0.0.1@3306@pegawai

SHOW DATABASES;

use pegawai;

show tables;

DESCRIBE proyek_pegawai;

insert into proyek values('NP001', 'BRR'), ('NP002', 'PEMDA'), ('NP003', 'CBR'), ('NP004', 'ASK'), ('NP005', 'OB');

insert into golongan values('A', 1000000), ('B', 900000), ('C', 750000), ('D', 500000);

insert into pegawai (no_pegawai, nama_pegawai) values ('PEG01', 'Anton'), ('PEG02', 'Paula'), ('PEG03', 'Daniar'), ('PEG04', 'Lubis'), ('PEG05', 'Koko'), ('PEG06', 'Yuni'), ('PEG07', 'Keni'), ('PEG08', 'Sofi'), ('PEG12', 'Sita'), ('PEG14', 'Yusni'), ('PEG15', 'Udin'), ('PEG16', 'Didit'), ('PEG17', 'Dani');

UPDATE pegawai 
SET nama_pegawai = "reva" 
WHERE golongan IN (NULL);

SELECT * FROM pegawai;

INSERT INTO proyek_pegawai VALUES ('NP005', 'PEG15'), ('NP004', 'PEG16'), ('NP004', 'PEG17');