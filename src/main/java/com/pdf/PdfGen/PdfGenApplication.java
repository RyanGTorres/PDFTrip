package com.pdf.PdfGen;

import com.pdf.PdfGen.entity.Cliente;
import org.aspectj.weaver.ast.Var;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Array;
import java.util.ArrayList;

@SpringBootApplication
public class PdfGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdfGenApplication.class, args);
	}

}
