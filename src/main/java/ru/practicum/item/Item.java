package ru.practicum.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "items", schema = "public")
@Data
public class Item {

    @Id
    @Column(name = "item_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

//    @CollectionTable(name="users", joinColumns=@JoinColumn(name="user_id"))
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "url")
    private String url;

    @ElementCollection
    @CollectionTable(name="tags", joinColumns = @JoinColumn(name = "item_id"))
    @Column(name = "name")
    private Set<String> tags = new HashSet<>();
}
