package com.example.demo.service;


public interface InformationService {
    List<Information> findAll();

    void saveData(InformationPojo informationPojo);

    void deleteById(Integer id);

    Optional<Information> findById(Integer id);
}
j