
use furama;

insert into vi_tri values(1,'QN');
insert into vi_tri values(2,'ĐN');

insert into trinh_do values(1,'Cao Đẳng');
insert into trinh_do values(2,'Đại Học');

insert into bo_phan values(1,'Phục vụ');
insert into bo_phan values(2,'Quán lý');

insert into loai_khach values(1,'Menber');
insert into loai_khach values(2,'Good');
   
insert into kieu_thue values(1,'giờ');
insert into kieu_thue values(2,'ngày');

insert into loai_dich_vu values(1,'House');
insert into loai_dich_vu values(2,'Villa');

insert into nhan_vien values(1,'Nguyễn Anh Tâm','2002-08-26','206405031',1000,'0763709673','tam@gmail.com','quảng nam',1,1,1);
insert into nhan_vien values(2,'Nguyễn Anh Tuấn','2000-09-20','306405031',2000,'0763709675','tuan@gmail.com','quảng nam',2,2,2);


insert into khach_hang values(1,1,'Tran hung','2000-01-01',1,'123456789','0123456789','hung@gmail.com','quảng nam');
insert into khach_hang values(2,2,'Tran vi','2001-02-02',1,'223456780','0234567890','vi@gmail.com','đà nẵng');

insert into hop_dong values(1,'2021-09-09','2022-01-01',10000,1,1,1);
insert into hop_dong values(2,'2020-06-01','2021-09-06',19000,2,2,2);


insert into dich_vu_di_kem values(1	,'karaoke',5000,'1','mới');
insert into dich_vu_di_kem values(2	,'xông hơi',10000,'1','mới');

insert into dich_vu values(1,'Villa',100,1000,5,1,1,'4 sao','Điều hòa',20,3);
insert into dich_vu values(2,'House',200,10000,10,2,2,'5 sao','Điều hòa',20,5);


select * 
from furama.nhan_vien
where ho_ten like "N%";
