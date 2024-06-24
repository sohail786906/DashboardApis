package com.dashboard.demo.Repository;

import com.dashboard.demo.entity.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {

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
