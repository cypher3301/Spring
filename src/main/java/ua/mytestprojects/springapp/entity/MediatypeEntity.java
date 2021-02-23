package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "mediatype", schema = "chinook", catalog = "")
public class MediatypeEntity {
    private Long id;
    private int mediaTypeId;
    private String name;
    private Collection<TrackEntity> tracksByMediaTypeId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "MediaTypeId", nullable = false)
    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
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
        MediatypeEntity that = (MediatypeEntity) o;
        return mediaTypeId == that.mediaTypeId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediaTypeId, name);
    }

    @OneToMany(mappedBy = "mediatypeByMediaTypeId")
    public Collection<TrackEntity> getTracksByMediaTypeId() {
        return tracksByMediaTypeId;
    }

    public void setTracksByMediaTypeId(Collection<TrackEntity> tracksByMediaTypeId) {
        this.tracksByMediaTypeId = tracksByMediaTypeId;
    }
}
