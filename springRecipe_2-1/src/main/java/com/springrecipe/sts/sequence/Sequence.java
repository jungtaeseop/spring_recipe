package com.springrecipe.sts.sequence;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Getter;

@Getter
public class Sequence {
	private final String id;
    private final String prefix;
    private final String suffix;
    
    public Sequence(String id, String prefix, String suffix) {
    	this.id = id;
    	this.prefix = prefix;
    	this.suffix = suffix;
    }
    
    public String getId() {
    	return id;
    }
    
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
