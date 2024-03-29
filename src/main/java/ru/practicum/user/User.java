package ru.practicum.user;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "users", schema = "public")
@Data
public class User {

    @Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    @Column(name = "registration_date")
    private Instant registrationDate = Instant.now();

    @Enumerated(EnumType.STRING)
    private UserState state;
}
