package com.libedi.demo.api.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.libedi.demo.api.model.Member;

/**
 * MemberRepository
 * @author Sangjun, Park
 *
 */
@RepositoryRestResource
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {

}
