package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shop.domain.Authorities;

@Repository
public interface AuthoritiesRepo extends JpaRepository<Authorities, Integer> {

}
