package com.dashboard.demo.serviceimpl;



import com.dashboard.demo.Repository.DataRepository;
import com.dashboard.demo.Service.DataService;
import com.dashboard.demo.entity.DataEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    private final DataRepository dataRepository;

    @Autowired
    public DataServiceImpl(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @Override
    public List<DataEntity> findByStartYear(String startYear) {
        return dataRepository.findByStartYear(startYear);
    }

    @Override
    public List<DataEntity> findByEndYear(int endYear) {
        return dataRepository.findByEndYear(endYear);
    }

    @Override
    public List<DataEntity> findByCityLng(String cityLng) {
        return dataRepository.findByCityLng(cityLng);
    }

    @Override
    public List<DataEntity> findByCityLat(String cityLat) {
        return dataRepository.findByCityLat(cityLat);
    }

    @Override
    public List<DataEntity> findByIntensity(int intensity) {
        return dataRepository.findByIntensity(intensity);
    }

    @Override
    public List<DataEntity> findBySector(String sector) {
        return dataRepository.findBySector(sector);
    }

    @Override
    public List<DataEntity> findByTopic(String topic) {
        return dataRepository.findByTopic(topic);
    }

    @Override
    public List<DataEntity> findByInsight(String insight) {
        return dataRepository.findByInsight(insight);
    }

    @Override
    public List<DataEntity> findBySwot(String swot) {
        return dataRepository.findBySwot(swot);
    }

    @Override
    public List<DataEntity> findByUrl(String url) {
        return dataRepository.findByUrl(url);
    }

    @Override
    public List<DataEntity> findByRegion(String region) {
        return dataRepository.findByRegion(region);
    }

    @Override
    public List<DataEntity> findByImpact(String impact) {
        return dataRepository.findByImpact(impact);
    }

    @Override
    public List<DataEntity> findByAdded(String added) {
        return dataRepository.findByAdded(added);
    }

    @Override
    public List<DataEntity> findByPublished(String published) {
        return dataRepository.findByPublished(published);
    }

    @Override
    public List<DataEntity> findByCity(String city) {
        return dataRepository.findByCity(city);
    }

    @Override
    public List<DataEntity> findByCountry(String country) {
        return dataRepository.findByCountry(country);
    }

    @Override
    public List<DataEntity> findByRelevance(int relevance) {
        return dataRepository.findByRelevance(relevance);
    }

    @Override
    public List<DataEntity> findByPestle(String pestle) {
        return dataRepository.findByPestle(pestle);
    }

    @Override
    public List<DataEntity> findBySource(String source) {
        return dataRepository.findBySource(source);
    }

    @Override
    public List<DataEntity> findByTitle(String title) {
        return dataRepository.findByTitle(title);
    }

    @Override
    public List<DataEntity> findByLikelihood(int likelihood) {
        return dataRepository.findByLikelihood(likelihood);
    }
}
