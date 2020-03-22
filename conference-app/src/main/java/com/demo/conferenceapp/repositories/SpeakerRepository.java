package com.demo.conferenceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.conferenceapp.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}
