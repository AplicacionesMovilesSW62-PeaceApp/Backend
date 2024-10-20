package com.upc.pre.peaceapp.models;

import com.upc.pre.peaceapp.shared.documentation.models.AuditableAbstractAggregateRoot;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "alerts")
public class Alert extends AuditableAbstractAggregateRoot<Alert> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key

    @Column(name = "location", nullable = false, length = 100)
    private String location;

    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @Column(name = "description", nullable = true, length = 255)
    private String description;

    @Column(name = "id_user", nullable = false)
    private int idUser;

    @Column(name = "image_url", nullable = true, length = 255) // New field for image URL
    private String imageUrl;

    public Alert(String location, String type, String description, int idUser, String imageUrl) {
        this.location = location;
        this.type = type;
        this.description = description;
        this.idUser = idUser;
        this.imageUrl = imageUrl; // Set the image URL
    }
}
