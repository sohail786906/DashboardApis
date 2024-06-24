package com.dashboard.demo.controller;

import com.dashboard.demo.Service.DataService;
import com.dashboard.demo.entity.DataEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class DataController {
@Autowired
    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }
    
    @GetMapping("/startYear/{startYear}")
    public ResponseEntity<List<DataEntity>> getByStartYear(@PathVariable String startYear) {
        try {
            List<DataEntity> entities = dataService.findByStartYear(startYear);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/endYear/{endYear}")
    public ResponseEntity<List<DataEntity>> getByEndYear(@PathVariable int endYear) {
        try {
            List<DataEntity> entities = dataService.findByEndYear(endYear);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/cityLng/{cityLng}")
    public ResponseEntity<List<DataEntity>> getByCityLng(@PathVariable String cityLng) {
        try {
            List<DataEntity> entities = dataService.findByCityLng(cityLng);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/cityLat/{cityLat}")
    public ResponseEntity<List<DataEntity>> getByCityLat(@PathVariable String cityLat) {
        try {
            List<DataEntity> entities = dataService.findByCityLat(cityLat);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/intensity/{intensity}")
    public ResponseEntity<List<DataEntity>> getByIntensity(@PathVariable int intensity) {
        try {
            List<DataEntity> entities = dataService.findByIntensity(intensity);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/sector/{sector}")
    public ResponseEntity<List<DataEntity>> getBySector(@PathVariable String sector) {
        try {
            List<DataEntity> entities = dataService.findBySector(sector);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/topic/{topic}")
    public ResponseEntity<List<DataEntity>> getByTopic(@PathVariable String topic) {
        try {
            List<DataEntity> entities = dataService.findByTopic(topic);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/insight/{insight}")
    public ResponseEntity<List<DataEntity>> getByInsight(@PathVariable String insight) {
        try {
            List<DataEntity> entities = dataService.findByInsight(insight);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/swot/{swot}")
    public ResponseEntity<List<DataEntity>> getBySwot(@PathVariable String swot) {
        try {
            List<DataEntity> entities = dataService.findBySwot(swot);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/url/{url}")
    public ResponseEntity<List<DataEntity>> getByUrl(@PathVariable String url) {
        try {
            List<DataEntity> entities = dataService.findByUrl(url);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/region/{region}")
    public ResponseEntity<List<DataEntity>> getByRegion(@PathVariable String region) {
        try {
            List<DataEntity> entities = dataService.findByRegion(region);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/impact/{impact}")
    public ResponseEntity<List<DataEntity>> getByImpact(@PathVariable String impact) {
        try {
            List<DataEntity> entities = dataService.findByImpact(impact);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/added/{added}")
    public ResponseEntity<List<DataEntity>> getByAdded(@PathVariable String added) {
        try {
            List<DataEntity> entities = dataService.findByAdded(added);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/published/{published}")
    public ResponseEntity<List<DataEntity>> getByPublished(@PathVariable String published) {
        try {
            List<DataEntity> entities = dataService.findByPublished(published);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/city/{city}")
    public ResponseEntity<List<DataEntity>> getByCity(@PathVariable String city) {
        try {
            List<DataEntity> entities = dataService.findByCity(city);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/country/{country}")
    public ResponseEntity<List<DataEntity>> getByCountry(@PathVariable String country) {
        try {
            List<DataEntity> entities = dataService.findByCountry(country);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/relevance/{relevance}")
    public ResponseEntity<List<DataEntity>> getByRelevance(@PathVariable int relevance) {
        try {
            List<DataEntity> entities = dataService.findByRelevance(relevance);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/pestle/{pestle}")
    public ResponseEntity<List<DataEntity>> getByPestle(@PathVariable String pestle) {
        try {
            List<DataEntity> entities = dataService.findByPestle(pestle);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/source/{source}")
    public ResponseEntity<List<DataEntity>> getBySource(@PathVariable String source) {
        try {
            List<DataEntity> entities = dataService.findBySource(source);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<DataEntity>> getByTitle(@PathVariable String title) {
        try {
            List<DataEntity> entities = dataService.findByTitle(title);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/likelihood/{likelihood}")
    public ResponseEntity<List<DataEntity>> getByLikelihood(@PathVariable int likelihood) {
        try {
            List<DataEntity> entities = dataService.findByLikelihood(likelihood);
            if (entities.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(entities, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
