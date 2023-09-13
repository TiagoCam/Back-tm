package com.tiago;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.Data;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tiago.model.Agenda;
import com.tiago.repository.AgendaRepository;

@SpringBootApplication
public class TransBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransBankBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(AgendaRepository agendaRepository) {
		return args -> {
                          
			agendaRepository.deleteAll();

			Agenda agenda1 = new Agenda();Agenda agenda2 = new Agenda();Agenda agenda3 = new Agenda();Agenda agenda4 = new Agenda();Agenda agenda5 = new Agenda();Agenda agenda6 = new Agenda();				
            agenda1.setContaOrigem("742774");agenda1.setContaDestino("312055");agenda1.setValor(1.561);agenda1.setDataRegistro(null);agenda1.setDataTransfer(null);
            agenda2.setContaOrigem("543456");agenda2.setContaDestino("031558");agenda2.setValor(1.441);agenda2.setDataRegistro(null);agenda2.setDataTransfer(null);
            agenda3.setContaOrigem("044141");agenda3.setContaDestino("339478");agenda3.setValor(1.907);agenda3.setDataRegistro(null);agenda3.setDataTransfer(null);
            agenda4.setContaOrigem("924310");agenda4.setContaDestino("013445");agenda4.setValor(1.298);agenda4.setDataRegistro(null);agenda4.setDataTransfer(null);
            agenda5.setContaOrigem("014423");agenda5.setContaDestino("315777");agenda5.setValor(2.413);agenda5.setDataRegistro(null);agenda5.setDataTransfer(null);
            agenda6.setContaOrigem("316488");agenda6.setContaDestino("772277");agenda6.setValor(1.177);agenda6.setDataRegistro(null);agenda6.setDataTransfer(null);

            agenda1.setDataTransfer(null);
            agenda2.setDataTransfer(null);
            agenda3.setDataTransfer(null);
            agenda4.setDataTransfer(null);
            agenda5.setDataTransfer(null);
            agenda6.setDataTransfer(null);


			agendaRepository.save(agenda1);agendaRepository.save(agenda2);agendaRepository.save(agenda3);agendaRepository.save(agenda4);agendaRepository.save(agenda5);agendaRepository.save(agenda6);
		};
	}

}