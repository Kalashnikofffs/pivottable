package ru.kalashnikof.pivottable.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kalashnikof.pivottable.service.DataService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/")
public class RestContr {
    private final ArrayList<String> VALID_PARAMS = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "y"));


    @Autowired
    private DataService dataService;

    private List<Map<String, Object>> error;


    @GetMapping
    private List<Map<String, Object>> getResults(
            @RequestParam("row") String row,
            @RequestParam("col") String col) {
        if (VALID_PARAMS.contains(row) && VALID_PARAMS.contains(col)) {
            return dataService.getAggregation(row, col);
        } else {
            return null;
        }
    }


}



