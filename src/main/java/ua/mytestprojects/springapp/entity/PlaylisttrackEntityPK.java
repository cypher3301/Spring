package ua.mytestprojects.springapp.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PlaylisttrackEntityPK implements Serializable {
    private int playlistId;
    private int trackId;

    @Column(name = "PlaylistId", nullable = false)
    @Id
    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    @Column(name = "TrackId", nullable = false)
    @Id
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
        PlaylisttrackEntityPK that = (PlaylisttrackEntityPK) o;
        return playlistId == that.playlistId && trackId == that.trackId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, trackId);
    }
}
