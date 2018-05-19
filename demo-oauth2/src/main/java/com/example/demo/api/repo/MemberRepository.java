package com.example.demo.api.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.api.model.Member;

@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {

}
