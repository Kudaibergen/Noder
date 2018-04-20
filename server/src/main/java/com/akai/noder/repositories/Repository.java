package com.akai.noder.repositories;

import com.akai.noder.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface Repository<T extends BaseEntity> extends JpaRepository<T, Long> {
}
