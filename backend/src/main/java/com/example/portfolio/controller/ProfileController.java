package com.example.portfolio.controller;

import com.example.portfolio.model.PortfolioProfile;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:5173", "http://127.0.0.1:5173"})
public class ProfileController {

    @GetMapping("/profile")
    public PortfolioProfile getProfile() {
        return new PortfolioProfile(
            "RAJU KUMAR",
            "Production Support Lead & Java Backend Developer",
            "+91 9056486858",
            "r15.polytechnic@gmail.com",
            "linkedin.com/in/rajukumar05",
            "Results-driven Production Support Lead & Java Backend Developer with 7+ years of experience in incident management, production support, and backend development in telecom and banking domains. Proven track record of leading cross-functional teams to resolve production issues, monitoring systems for anomalies, and driving remediation efforts within strict SLAs. Adept at root cause analysis, stakeholder communication, and process improvement, with strong technical expertise in Java, Spring Boot, Microservices, SQL, Splunk, and RabbitMQ.",
            List.of(
                "Production incident leadership",
                "Java and Spring Boot architecture",
                "Root cause analysis",
                "Microservices operations",
                "Stakeholder communication"
            ),
            List.of(
                new PortfolioProfile.Experience(
                    "Production Support Lead / Java Backend Developer",
                    "Infosys",
                    "Nov 2025 – Present",
                    "Pune",
                    List.of(
                        "Lead production incident triage, troubleshooting, and resolution across dev, infra, DB, and operations teams.",
                        "Provide L2/L3 production and application support within defined SLAs.",
                        "Perform detailed RCA for recurring issues and drive corrective and preventive action.",
                        "Monitor application health using Splunk, AppDynamics, and Grafana.",
                        "Support Java/Spring Boot microservices, REST APIs, and RabbitMQ/Kafka integration issues."
                    )
                ),
                new PortfolioProfile.Experience(
                    "Software Developer",
                    "Amdocs",
                    "Feb 2022 – Present",
                    "Gurugram",
                    List.of(
                        "Led production issue triage and resolution for T-Mobile promotions systems.",
                        "Designed and developed scalable microservices using Java 8 and Spring Boot for telecom promotion workflows.",
                        "Monitored Splunk dashboards to detect anomalies and reduce production incidents.",
                        "Owned RCA, fixes, SLA compliance, and production support across deployment cycles."
                    )
                ),
                new PortfolioProfile.Experience(
                    "Project Engineer",
                    "Wipro Limited",
                    "Nov 2019 – Feb 2022",
                    "Citi Bank – EUC Remediation",
                    List.of(
                        "Handled data modeling and EUC remediation with business analysis support.",
                        "Acted as operational DBA for daily DB script deployment across environments.",
                        "Assisted in RCA for data and database issues to support production stability."
                    )
                )
            ),
            List.of(
                new PortfolioProfile.Education(
                    "Chandigarh Engineering College, Mohali",
                    "Bachelor of Technology in Computer Science & Engineering",
                    "2015 – 2019",
                    "Mohali, Punjab",
                    "CGPA – 81.6/10.0"
                ),
                new PortfolioProfile.Education(
                    "Gaya College, Gaya",
                    "Bihar School Examination Board",
                    "2014",
                    "Gaya, Bihar",
                    "Percentage: 66.80%"
                ),
                new PortfolioProfile.Education(
                    "Manas Vidyalaya",
                    "All India Secondary School Examination",
                    "2012",
                    "Jehanabad, Bihar",
                    "CGPA – 10.0/10.0"
                )
            ),
            List.of(
                "Java", "Spring Boot", "Spring Data JPA", "RESTful APIs", "Microservices",
                "Oracle", "MySQL", "SQL", "RabbitMQ", "Kafka", "Splunk", "AppDynamics",
                "Grafana", "Git", "GitHub", "Jenkins", "Docker", "Kubernetes", "JUnit", "Mockito",
                "CI/CD", "Linux/Unix"
            ),
            List.of(
                new PortfolioProfile.Achievement("Production support", "7+ years in telecom and banking operations"),
                new PortfolioProfile.Achievement("Incident reduction", "Reduced production incidents by 25% through proactive monitoring"),
                new PortfolioProfile.Achievement("Operational excellence", "Improved deployment accuracy and minimized manual intervention"),
                new PortfolioProfile.Achievement("Quality focus", "Strong experience in RCA, SLAs, and ITIL-aligned process compliance")
            )
        );
    }
}
