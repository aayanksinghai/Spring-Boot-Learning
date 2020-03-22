package com.demo.conferenceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.conferenceapp.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
