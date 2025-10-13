package dev.lliriq.bookmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Книга")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Уникальный идентификатор", accessMode = Schema.AccessMode.READ_ONLY)
    private Long id;

    @Schema(description = "Название книги", example = "Преступление и наказание")
    private String title;

    @Schema(description = "Автор книги", example = "Фёдор Достоевский")
    private String author;

    @Schema(description = "Год издания", example = "1866")
    private Short year;

    @Schema(description = "Количество страниц", example = "480")
    private Short pages;
}
