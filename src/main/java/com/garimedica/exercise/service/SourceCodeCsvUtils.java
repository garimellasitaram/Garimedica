package com.garimedica.exercise.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

@Service
public class SourceCodeCsvUtils {
	
	private static final CsvMapper mapper = new CsvMapper();
	
    public <T> List<T> read(Class<T> clazz, InputStream stream) throws IOException {
        CsvSchema schema = mapper.schemaFor(clazz).withHeader().withColumnReordering(true);
        ObjectReader reader = mapper.readerFor(clazz).with(schema);
        return reader.<T>readValues(stream).readAll();
    }
	
	/*
	 * private final CsvMapper mapper; private CsvToBean<SourceCode> csvReader;
	 * 
	 * public CsvUtils() { this.mapper = new CsvMapper(); csvReader = new
	 * CsvToBeanBuilder(reader) .withType(Product.class) .withSeparator(',')
	 * .withIgnoreLeadingWhiteSpace(true) .withIgnoreEmptyLine(true) .build(); }
	 * 
	 * 
	 * 
	 * public List<SourceCode> readFile(String fileName) throws
	 * FileNotFoundException {
	 * 
	 * Reader reader = new BufferedReader(new FileReader("file.csv"));
	 * 
	 * CsvToBean<SourceCode> csvReader = new CsvToBeanBuilder(reader)
	 * .withType(SourceCode.class) .withSeparator(',')
	 * .withIgnoreLeadingWhiteSpace(true) .withIgnoreEmptyLine(true) .build();
	 * 
	 * List<SourceCode> results = csvReader.parse(); return results; }
	 */
}