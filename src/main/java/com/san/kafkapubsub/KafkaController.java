/*
 * package com.san.kafkapubsub;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.kafka.core.KafkaTemplate; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController
 * 
 * @RequestMapping("/") public class KafkaController {
 * 
 * 
 * @Autowired private KafkaTemplate<String, Object> template;
 * 
 * private String topic = "FirstKafkaTopic";
 * 
 * @GetMapping("/publish/{message}") public String publish(@PathVariable String
 * message) { template.send(topic, message); return "Message published"; }
 * 
 * 
 * }
 */
