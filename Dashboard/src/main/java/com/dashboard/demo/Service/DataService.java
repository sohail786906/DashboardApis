package com.dashboard.demo.Service;

import java.util.List;

import com.dashboard.demo.entity.DataEntity;

public interface DataService {
	
	 List<DataEntity> findByStartYear(String startYear);

	    List<DataEntity> findByEndYear(int endYear);

	    List<DataEntity> findByCityLng(String cityLng);

	    List<DataEntity> findByCityLat(String cityLat);

	    List<DataEntity> findByIntensity(int intensity);

	    List<DataEntity> findBySector(String sector);

	    List<DataEntity> findByTopic(String topic);

	    List<DataEntity> findByInsight(String insight);

	    List<DataEntity> findBySwot(String swot);

	    List<DataEntity> findByUrl(String url);

	    List<DataEntity> findByRegion(String region);

	    List<DataEntity> findByImpact(String impact);

	    List<DataEntity> findByAdded(String added);

	    List<DataEntity> findByPublished(String published);

	    List<DataEntity> findByCity(String city);

	    List<DataEntity> findByCountry(String country);

	    List<DataEntity> findByRelevance(int relevance);

	    List<DataEntity> findByPestle(String pestle);

	    List<DataEntity> findBySource(String source);

	    List<DataEntity> findByTitle(String title);

	    List<DataEntity> findByLikelihood(int likelihood);
}

