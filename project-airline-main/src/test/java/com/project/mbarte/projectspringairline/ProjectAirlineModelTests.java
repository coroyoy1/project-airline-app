package com.project.mbarte.projectspringairline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.project.mbarte.projectspringairline.model.FlightModel;
import com.project.mbarte.projectspringairline.wrapper.FlightWrapper;
import com.project.mbarte.projectspringairline.services.AirlabsServiceImpl;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class ProjectAirlineModelTests {

	@Mock
	RestTemplate restTemplate;

	@InjectMocks
	AirlabsServiceImpl airlabsService;

	@Test
	void testFlight(){
		FlightModel flight = new FlightModel("000", "USA", "CL", "USA","", "", "null", "null");
		FlightWrapper wrapper = new FlightWrapper();
		List<FlightModel> list = List.of(flight);
		wrapper.setResponse(list);
		ResponseEntity<FlightWrapper> response = new ResponseEntity<>(wrapper, HttpStatus.OK);
		when(restTemplate.getForEntity(anyString(), eq(FlightWrapper.class))).thenReturn(response);
		List<FlightModel> result = airlabsService.searchSpecificFlight("USA");
		assertEquals(1, result.size());
	}

}
