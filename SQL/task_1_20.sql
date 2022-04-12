-- task2;

use furama;
select *
from nhan_vien 
where (ho_ten like 'T%' or ho_ten like 'H%'or ho_ten like 'K%') and length(ho_ten) <=15; 


-- task3-- 

SELECT round(datediff(CURDATE() , ngay_sinh) /365,0) as tuoi , ho_ten
from khach_hang
where dia_chi = 'QN' or dia_chi = 'DN' 
having (tuoi >= 18 and tuoi <60) ;

-- round(datediff(CURDATE() , ngay_sinh) /365,0) = tuổi thông qua từ ' as '
-- having thì đi vs as 

-- tast 4
-- Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần.
--  Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
--  Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select k.ho_ten,count(h.ma_hop_dong) as so_lan_dat_phong
from khach_hang k 
inner join hop_dong h
on k.ma_khach_hang =h.ma_khach_hang
inner join loai_khach l 
on k.ma_loai_khach = l.ma_loai_khach
where l.ten_loai_khach = "diamond"
group by k.ma_khach_hang 
order by so_lan_dat_phong;

select *
from khach_hang;
select *
from hop_dong;
select *
from loai_khach;





-- task 5;
select * 
from loai_khach;
select *
from khach_hang;
select *
from hop_dong;      
select *
from hop_dong_chi_tiet;

select h.ma_khach_hang , k.ho_ten, h.ma_hop_dong, d.ma_dich_vu, h.ngay_lam_hop_dong,h.ngay_ket_thuc, sum(d.chi_phi_thue + hd.so_luong * dv.gia) as tong_tien
from hop_dong h
inner join khach_hang k on h.ma_khach_hang = k.ma_khach_hang 
inner join dich_vu d on h.ma_dich_vu = d.ma_dich_vu
inner join hop_dong_chi_tiet hd on h.ma_hop_dong = hd.ma_hop_dong
inner join dich_vu_di_kem dv on hd.ma_dich_vu_di_kem = dv.ma_dich_vu_di_kem
-- gọp thao ma_hop_dong nếu k có group by thì xem như chỉ có 1 ma hop dong thôi
group by h.ma_hop_dong;





-- task 6;
select * from dich_vu;
select * from hop_dong;

select d.ma_dich_vu, d.ten_dich_vu, d.dien_tich,d.chi_phi_thue,l.ten_loai_dich_vu 
from dich_vu d 
inner join loai_dich_vu l on d.ma_loai_dich_vu = l.ma_loai_dich_vu
where not exists(
select h.ma_hop_dong
from hop_dong h
where(h.ngay_lam_hop_dong between '2019-01-01' and '2019-03-01') and  h.ma_dich_vu = d.ma_dich_vu 
);

-- task7
select * from dich_vu;
select * from loai_dich_vu;

select d.ma_dich_vu , d.ten_dich_vu , d.dien_tich,d.chi_phi_thue,l.ten_loai_dich_vu
from dich_vu d 
inner join loai_dich_vu l on d.ma_loai_dich_vu = l.ma_loai_dich_vu
where exists(
select h.ma_hop_dong
from hop_dong h
where(h.ngay_lam_hop_dong between '2018-01-01' and '2018-12-31')and h.ma_dich_vu = d.ma_dich_vu ) 
and not exists(
select h.ma_hop_dong
from hop_dong h
where(h.ngay_lam_hop_dong between '2019-01-01' and '2019-12-31') and  h.ma_dich_vu = d.ma_dich_vu 
);

-- task 8 
-- Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
select distinct ho_ten
from khach_hang;

select ho_ten 
from khach_hang
group by ho_ten;

select ho_ten
from khach_hang 
union 
select ho_ten 
from khach_hang;





-- task 9 
-- Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng 
-- trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select month((h.ngay_lam_hop_dong)) as thang ,count(h.ma_hop_dong) as so_lan_dat_phong
from khach_hang k 
inner join hop_dong h
on k.ma_khach_hang =h.ma_khach_hang
inner join loai_khach l 
on k.ma_loai_khach = l.ma_loai_khach
where (h.ngay_lam_hop_dong between '2019-01-01' and '2019-12-31')
group by month(h.ngay_lam_hop_dong) 
order by h.ngay_lam_hop_dong ;
	
    
-- task 10
select * 
from hop_dong;
select * from dich_vu_di_kem;

select  h.ma_hop_dong,h.ngay_lam_hop_dong,h.ngay_ket_thuc,h.tien_dat_coc ,sum(v.don_vi) as so_luong_dich_vu_di_kem
from hop_dong h 
inner join hop_dong_chi_tiet hd on h.ma_hop_dong = hd.ma_hop_dong
 inner join dich_vu_di_kem v on hd.ma_dich_vu_di_kem = v.ma_dich_vu_di_kem
 group by h.ma_hop_dong;
 



