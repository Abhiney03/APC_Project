// src/main/java/com/garvit/roomiefinder/service/UserMatch.java
// Note: Placing this in the service package is fine, or it can be a DTO.
package com.garvit.roomiefinder.service;

import com.garvit.roomiefinder.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserMatch {
    private User user;
    private int score;
}
