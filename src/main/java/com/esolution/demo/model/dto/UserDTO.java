package com.esolution.demo.model.dto;

import java.util.UUID;

public record UserDTO(UUID id, String firstName, String lastName, LocationDTO location) {

}
