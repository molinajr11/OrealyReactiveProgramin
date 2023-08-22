package com.oreilly.restclient.json;
// Records:
//- are inmutable
//- are inmutable

import java.util.List;

public record AstroResponse( String message, int number, List<Assignment> people) {
    public record Assignment(String name, String craft) { }
}

