package dev.local.dto;

import dev.local.domain.Profile;
import dev.local.domain.Project;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class QueryProjectDTO extends Project {
    @Getter
    private List<Profile> members;
}
