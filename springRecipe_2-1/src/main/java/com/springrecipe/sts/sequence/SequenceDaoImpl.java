package com.springrecipe.sts.sequence;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component("sequenceDao")
public class SequenceDaoImpl implements SequenceDao{

	private final Map<String,Sequence> sequences = new HashMap<>();
	private final Map<String,AtomicInteger> values = new HashMap<>();
	
	public SequenceDaoImpl() {
        sequences.put("IT", new Sequence("IT", "30", "A"));
        values.put("IT", new AtomicInteger(10000));
    }
	
	@Override
	public Sequence getSequence(String sequenceId) {
		
		return sequences.get(sequenceId);
	}

	@Override
	public int getNextValue(String sequenceId) {
		log.info("sequenceId :  {}",sequenceId);
		AtomicInteger value = values.get(sequenceId);
		log.info("value :  {}",value);
		return value.getAndIncrement();
	}

}
