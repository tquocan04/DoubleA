package com.doublea.repository;

import com.doublea.dto.LoaiHangDTO;
import com.doublea.model.LoaiHangModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@Repository
public interface LoaiHangRepository extends JpaRepository<LoaiHangModel, String>{
	 @Query("SELECT new com.doublea.dto.LoaiHangDTO(l.tenLH) FROM LoaiHangModel l")
	 List<LoaiHangDTO> findAllLoaiHangDTO();

}