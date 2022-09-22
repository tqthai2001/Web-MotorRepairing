package com.sapo.edu.payload.searchrequest;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Deprecated
@Getter
@Setter
public class SearchParam {
    private List<String> searchParams;
}
