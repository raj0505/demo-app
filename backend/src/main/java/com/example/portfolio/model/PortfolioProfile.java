package com.example.portfolio.model;

import java.util.List;

public record PortfolioProfile(
    String name,
    String title,
    String phone,
    String email,
    String linkedin,
    String summary,
    List<String> strengths,
    List<Experience> experience,
    List<Education> education,
    List<String> skills,
    List<Achievement> achievements
) {
    public record Experience(
        String role,
        String company,
        String period,
        String location,
        List<String> responsibilities
    ) {}

    public record Education(
        String institution,
        String degree,
        String period,
        String location,
        String details
    ) {}

    public record Achievement(
        String label,
        String value
    ) {}
}
