package com.example.java4.repositories;
import com.example.java4.entities.HDCT;
import com.example.java4.entities.KhachHang;
import com.example.java4.entities.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

import java.util.Optional;

@Repository
public interface NhanVienRepository
        extends JpaRepository<NhanVien,Integer>
{
    public static final int ACTIVE  = 1;
    public static final int INACTIVE =0;
    public Page<NhanVien> findByTrangThai(int trangThai, Pageable pageable);
    public Optional<NhanVien> findById(Integer id);
};
