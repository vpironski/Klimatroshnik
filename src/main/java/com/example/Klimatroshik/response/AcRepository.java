package com.example.Klimatroshik.response;

import com.example.Klimatroshik.model.entitiy.AC;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AcRepository extends MongoRepository<AC, String>{
}
