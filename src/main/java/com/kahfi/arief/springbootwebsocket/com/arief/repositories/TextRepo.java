package com.kahfi.arief.springbootwebsocket.com.arief.repositories;

import com.kahfi.arief.springbootwebsocket.com.arief.entity.Text;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepo extends CrudRepository<Text,Integer>{
}
