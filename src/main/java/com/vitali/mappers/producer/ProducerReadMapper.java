package com.vitali.mappers.producer;

import com.vitali.database.entities.Producer;
import com.vitali.dto.producer.ProducerReadDto;
import com.vitali.mappers.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProducerReadMapper implements Mapper<Producer, ProducerReadDto> {
    @Override
    public ProducerReadDto map(Producer object) {
        return ProducerReadDto.builder()
                .id(object.getId())
                .name(object.getName())
                .build();
    }
}
