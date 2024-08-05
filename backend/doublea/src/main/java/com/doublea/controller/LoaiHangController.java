package com.doublea.controller;

import com.doublea.dto.LoaiHangDTO;
import com.doublea.service.LoaiHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping("/api/loaihang")
@CrossOrigin(origins = "http://localhost:3000")
public class LoaiHangController {
	
	@Autowired
    private LoaiHangService loaiHangService;

    @GetMapping
    public List<LoaiHangDTO> getAllLoaiHang() {
		List<LoaiHangDTO> loaiHang = loaiHangService.getAllLoaiHang();
        return loaiHang;
    }
}