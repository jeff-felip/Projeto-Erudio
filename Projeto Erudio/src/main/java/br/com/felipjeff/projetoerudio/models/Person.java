package br.com.felipjeff.projetoerudio.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "fist_name", length = 80, nullable = false)
    private String fistName;

    @Column(name = "last_name", length = 80, nullable = false)
    private String lastName;

    @Column(name = "address", length = 100  , nullable = false)
    private String address;

    @Column(name = "gender", length = 6, nullable = false)
    private String gender;

    public Person(String fistName, String lastName, String address, String gender) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
    }
}
