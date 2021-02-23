package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "playlisttrack", schema = "chinook", catalog = "")
@IdClass(PlaylisttrackEntityPK.class)
public class PlaylisttrackEntity {
    private Long id;
    private int playlistId;
    private int trackId;
    private PlaylistEntity playlistByPlaylistId;
    private TrackEntity trackByTrackId;

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

    @Id
    @Column(name = "TrackId", nullable = false)
    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaylisttrackEntity that = (PlaylisttrackEntity) o;
        return playlistId == that.playlistId && trackId == that.trackId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, trackId);
    }

    @ManyToOne
    @JoinColumn(name = "PlaylistId", referencedColumnName = "PlaylistId", nullable = false)
    public PlaylistEntity getPlaylistByPlaylistId() {
        return playlistByPlaylistId;
    }

    public void setPlaylistByPlaylistId(PlaylistEntity playlistByPlaylistId) {
        this.playlistByPlaylistId = playlistByPlaylistId;
    }

    @ManyToOne
    @JoinColumn(name = "TrackId", referencedColumnName = "TrackId", nullable = false)
    public TrackEntity getTrackByTrackId() {
        return trackByTrackId;
    }

    public void setTrackByTrackId(TrackEntity trackByTrackId) {
        this.trackByTrackId = trackByTrackId;
    }
}
