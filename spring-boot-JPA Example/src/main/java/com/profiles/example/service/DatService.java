package com.profiles.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatService {

    @Autowired
    private DataDao dataDao;
}
