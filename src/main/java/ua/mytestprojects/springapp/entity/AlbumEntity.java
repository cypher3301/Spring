package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "album", schema = "chinook", catalog = "")
public class AlbumEntity {
    private Long id;
    private int albumId;
    private String title;
    private int artistId;
    private ArtistEntity artistByArtistId;
    private Collection<TrackEntity> tracksByAlbumId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "AlbumId", nullable = false)
    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    @Basic
    @Column(name = "Title", nullable = false, length = 160)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "ArtistId", nullable = false)
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumEntity that = (AlbumEntity) o;
        return albumId == that.albumId && artistId == that.artistId && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, title, artistId);
    }

    @ManyToOne
    @JoinColumn(name = "ArtistId", referencedColumnName = "ArtistId", nullable = false)
    public ArtistEntity getArtistByArtistId() {
        return artistByArtistId;
    }

    public void setArtistByArtistId(ArtistEntity artistByArtistId) {
        this.artistByArtistId = artistByArtistId;
    }

    @OneToMany(mappedBy = "albumByAlbumId")
    public Collection<TrackEntity> getTracksByAlbumId() {
        return tracksByAlbumId;
    }

    public void setTracksByAlbumId(Collection<TrackEntity> tracksByAlbumId) {
        this.tracksByAlbumId = tracksByAlbumId;
    }
}
