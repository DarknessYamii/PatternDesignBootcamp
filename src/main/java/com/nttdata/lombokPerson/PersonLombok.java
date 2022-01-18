package com.nttdata.lombokPerson;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Value;

@Getter
@Data
@Value
@Builder(toBuilder=true)
public class PersonLombok {

	 private final String name;
	 private final int age;
	
}
