package com.nguyenducmanh.talkifybackend.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.TimeZoneColumn;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PROTECTED)
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;

    @TimeZoneColumn
    @Column(nullable = false, columnDefinition = "DATETIMEOFFSET")
    ZonedDateTime insertedAt;

    @TimeZoneColumn
    @Column(columnDefinition = "DATETIMEOFFSET")
    ZonedDateTime updatedAt;

    @TimeZoneColumn
    @Column(columnDefinition = "DATETIMEOFFSET")
    ZonedDateTime deletedAt;
}
