package com.garimedica.exercise.data;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;

@Entity
@Data
public class SourceCode {
 
	@Id
	@CsvBindByName(column = "code")
    private String code;
	
	@CsvBindByName(column = "source")
    private String source;
	
	@CsvBindByName(column = "codeListCode")
    private String codeListCode;
	
	@CsvBindByName(column = "displayValue")
    private String displayValue;
	
	@CsvBindByName(column = "longDescription")
    private String longDescription;
	
	@CsvBindByName(column = "fromDate")
    private String fromDate;
	
	@CsvBindByName(column = "toDate")
    private String toDate;
	
	@CsvBindByName(column = "sortingPriority")
    private String sortingPriority;
	
}
