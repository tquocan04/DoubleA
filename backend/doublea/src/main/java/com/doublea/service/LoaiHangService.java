package com.doublea.service;

import com.doublea.model.LoaiHangModel;
import com.doublea.dto.LoaiHangDTO;
import com.doublea.repository.LoaiHangRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.stream.Collectors;

//import javax.annotation.PostConstruct;
//import java.util.UUID;

import java.util.List;
@Service
public class LoaiHangService {
	
	@Autowired
	private LoaiHangRepository loaiHangRepository;
	
	public List<LoaiHangDTO> getAllLoaiHang() {
		List<LoaiHangDTO> loaiHangDTO = loaiHangRepository.findAllLoaiHangDTO();
		return loaiHangDTO;
	}
	
}