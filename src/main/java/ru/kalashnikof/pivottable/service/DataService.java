package ru.kalashnikof.pivottable.service;

import java.util.List;
import java.util.Map;

public interface DataService {

    List<Map<String, Object>> getAggregation(String row, String col) ;
}
