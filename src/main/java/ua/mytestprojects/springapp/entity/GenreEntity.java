package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "genre", schema = "chinook", catalog = "")
public class GenreEntity {
    private Long id;
    private int genreId;
    private String name;
    private Collection<TrackEntity> tracksByGenreId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "GenreId", nullable = false)
    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 120)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreEntity that = (GenreEntity) o;
        return genreId == that.genreId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genreId, name);
    }

    @OneToMany(mappedBy = "genreByGenreId")
    public Collection<TrackEntity> getTracksByGenreId() {
        return tracksByGenreId;
    }

    public void setTracksByGenreId(Collection<TrackEntity> tracksByGenreId) {
        this.tracksByGenreId = tracksByGenreId;
    }
}
