package com.arccorp.travelagency;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TravelAgencyRepository extends PagingAndSortingRepository<TravelAgency, Integer> {

    public List<TravelAgency> findAll();
    
//    public Jobs findByName(String search);
//    
//    public List<Jobs> findByNameLike(String search);
//    
//    public List<Jobs> findByNameLike(Pageable p, String search);
    
}