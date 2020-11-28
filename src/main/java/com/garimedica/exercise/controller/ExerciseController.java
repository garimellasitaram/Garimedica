package com.garimedica.exercise.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.garimedica.exercise.data.SourceCode;
import com.garimedica.exercise.repository.SourceCodeRepository;
import com.garimedica.exercise.service.SourceCodeCsvUtils;

@RestController
public class ExerciseController {
	
	private final SourceCodeCsvUtils csvUtils;
    private final SourceCodeRepository repository;
    
    public ExerciseController(SourceCodeCsvUtils csvUtils,SourceCodeRepository repository) {
    	this.csvUtils = csvUtils;
    	this.repository = repository;
    }
    
    @GetMapping(value = "/findAll")
    public ResponseEntity<?> fetchAllSourceCodeData() {
    	List<SourceCode> data = repository.findAll();
    	if(!data.isEmpty()) {
    		return new ResponseEntity<List<SourceCode>>(data, HttpStatus.OK);
    	}else {
    		return new ResponseEntity<String>("NO data not found", HttpStatus.NOT_FOUND);
    	}
    }
    
    @GetMapping(value = "/find")
    public ResponseEntity<?> fetchByCode(@PathParam(value = "code") String code) {  
    	
    	if(code.isEmpty()) {
    		return new ResponseEntity<String>("code can not be empty", HttpStatus.BAD_REQUEST);
    	}

    	Optional<SourceCode> sourceCode = repository.findById(code);
    	if(sourceCode.isPresent()) {
    		return new ResponseEntity<SourceCode>(sourceCode.get(), HttpStatus.OK);
    	}else {
    		return new ResponseEntity<String>("data not found : "+code, HttpStatus.NOT_FOUND);
    	}
    	
    }
    
    @DeleteMapping(value = "/deleteAll")
    public ResponseEntity<?>  deleteAllSourceCodeData() {    	
    	 repository.deleteAll();
    	 return new ResponseEntity<String>("All records have been deleted", HttpStatus.OK);
    }
    
    
    @PostMapping(value = "/upload", consumes = "multipart/form-data")
    public ResponseEntity<?> uploadMultipart(@RequestParam("file") MultipartFile file) throws IOException {  
    	//validate the file
    	 if (file.isEmpty()) {
    		 return ResponseEntity.badRequest().body("csv file can not be empty");
         }
    	
    	List<SourceCode> data = csvUtils.read(SourceCode.class, file.getInputStream());
    	if(data.isEmpty()) {
    		return new ResponseEntity<String>("File does not have data to save", HttpStatus.OK);
    	}
    	
    	repository.saveAll(data);
    	return new ResponseEntity<String>("File uploaded and data stored successfully", HttpStatus.OK);
    }
   
    
}