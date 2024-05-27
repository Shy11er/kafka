package net.shyller.kafka.controller;

import lombok.RequiredArgsConstructor;
import net.shyller.kafka.dto.MessageDto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/messages")
public class MessageController {

  private final KafkaTemplate<String, String> kafkaTemplate;

  @PostMapping
  public void publish(@RequestBody MessageDto dto) {
    kafkaTemplate.send("topic", dto.getMessage());
  }
}
