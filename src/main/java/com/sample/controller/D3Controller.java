package com.sample.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.dto.GraphDto;

@RestController
@RequestMapping(path="/graphs")
public class D3Controller {

	private Logger logger = LoggerFactory.getLogger(D3Controller.class);

	@RequestMapping(path = "/barchart")
	public GraphDto getChartDetails() {
		logger.debug("D3Controller :: Getchartdetails :: entered");
		GraphDto graphDto = new GraphDto();
		graphDto.setChartName("Sample Graph");
		graphDto.setCurrentDate(new Date());

		Map<String, Double> map = new HashMap<String, Double>();
		map.put("A", .08167);
		map.put("B", .01492);
		map.put("C", .02782);
		map.put("D", .04253);
		map.put("E", .12702);

		graphDto.setChartData(map);
		return graphDto;
	}
}
