package com.github.xxvenonxx.carAtlas.domain.repository;

import com.github.xxvenonxx.carAtlas.domain.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Long> {
    List<Brand> findAll();
}

















