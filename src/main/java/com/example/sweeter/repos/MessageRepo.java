package com.example.sweeter.repos;

import com.example.sweeter.domen.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
