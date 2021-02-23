package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "playlist", schema = "chinook", catalog = "")
public class PlaylistEntity {
    private Long id;
    private int playlistId;
    private String name;
    private Collection<PlaylisttrackEntity> playlisttracksByPlaylistId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "PlaylistId", nullable = false)
    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
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
        PlaylistEntity that = (PlaylistEntity) o;
        return playlistId == that.playlistId && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, name);
    }

    @OneToMany(mappedBy = "playlistByPlaylistId")
    public Collection<PlaylisttrackEntity> getPlaylisttracksByPlaylistId() {
        return playlisttracksByPlaylistId;
    }

    public void setPlaylisttracksByPlaylistId(Collection<PlaylisttrackEntity> playlisttracksByPlaylistId) {
        this.playlisttracksByPlaylistId = playlisttracksByPlaylistId;
    }
}
