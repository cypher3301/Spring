package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "artist", schema = "chinook", catalog = "")
public class ArtistEntity {
    private Long id;
    private int artistId;
    private String name;
    private Collection<AlbumEntity> albumsByArtistId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "ArtistId", nullable = false)
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
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
        ArtistEntity that = (ArtistEntity) o;
        return artistId == that.artistId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistId, name);
    }

    @OneToMany(mappedBy = "artistByArtistId")
    public Collection<AlbumEntity> getAlbumsByArtistId() {
        return albumsByArtistId;
    }

    public void setAlbumsByArtistId(Collection<AlbumEntity> albumsByArtistId) {
        this.albumsByArtistId = albumsByArtistId;
    }
}
