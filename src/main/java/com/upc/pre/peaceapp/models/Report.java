package com.upc.pre.peaceapp.models;

import com.upc.pre.peaceapp.shared.documentation.models.AuditableAbstractAggregateRoot;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "reports")
public class Report extends AuditableAbstractAggregateRoot<Report> {
    @Getter
    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Getter
    @Setter
    @Column(name = "detail", nullable = true, length = 255)
    private String detail;

    @Getter
    @Column(name = "type", nullable = false, length = 50)
    private String type;

    @Getter
    @Column(name = "id_user", nullable = false)
    private Long idUser;

    public Report(String title, String detail, String type, Long idUser) {
        this.title = title;
        this.detail = detail;
        this.type = type;
        this.idUser = idUser;
    }

    public Report() {
    }
}
