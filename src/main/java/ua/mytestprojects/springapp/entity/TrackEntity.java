package ua.mytestprojects.springapp.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "track", schema = "chinook", catalog = "")
public class TrackEntity {
    private Long id;
    private int trackId;
    private String name;
    private Integer albumId;
    private int mediaTypeId;
    private Integer genreId;
    private String composer;
    private int milliseconds;
    private Integer bytes;
    private BigDecimal unitPrice;
    private Collection<InvoicelineEntity> invoicelinesByTrackId;
    private Collection<PlaylisttrackEntity> playlisttracksByTrackId;
    private AlbumEntity albumByAlbumId;
    private MediatypeEntity mediatypeByMediaTypeId;
    private GenreEntity genreByGenreId;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "TrackId", nullable = false)
    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 200)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "AlbumId", nullable = true)
    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    @Basic
    @Column(name = "MediaTypeId", nullable = false)
    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    @Basic
    @Column(name = "GenreId", nullable = true)
    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    @Basic
    @Column(name = "Composer", nullable = true, length = 220)
    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    @Basic
    @Column(name = "Milliseconds", nullable = false)
    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Basic
    @Column(name = "Bytes", nullable = true)
    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    @Basic
    @Column(name = "UnitPrice", nullable = false, precision = 2)
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackEntity that = (TrackEntity) o;
        return trackId == that.trackId && mediaTypeId == that.mediaTypeId && milliseconds == that.milliseconds && Objects.equals(name, that.name) && Objects.equals(albumId, that.albumId) && Objects.equals(genreId, that.genreId) && Objects.equals(composer, that.composer) && Objects.equals(bytes, that.bytes) && Objects.equals(unitPrice, that.unitPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackId, name, albumId, mediaTypeId, genreId, composer, milliseconds, bytes, unitPrice);
    }

    @OneToMany(mappedBy = "trackByTrackId")
    public Collection<InvoicelineEntity> getInvoicelinesByTrackId() {
        return invoicelinesByTrackId;
    }

    public void setInvoicelinesByTrackId(Collection<InvoicelineEntity> invoicelinesByTrackId) {
        this.invoicelinesByTrackId = invoicelinesByTrackId;
    }

    @OneToMany(mappedBy = "trackByTrackId")
    public Collection<PlaylisttrackEntity> getPlaylisttracksByTrackId() {
        return playlisttracksByTrackId;
    }

    public void setPlaylisttracksByTrackId(Collection<PlaylisttrackEntity> playlisttracksByTrackId) {
        this.playlisttracksByTrackId = playlisttracksByTrackId;
    }

    @ManyToOne
    @JoinColumn(name = "AlbumId", referencedColumnName = "AlbumId")
    public AlbumEntity getAlbumByAlbumId() {
        return albumByAlbumId;
    }

    public void setAlbumByAlbumId(AlbumEntity albumByAlbumId) {
        this.albumByAlbumId = albumByAlbumId;
    }

    @ManyToOne
    @JoinColumn(name = "MediaTypeId", referencedColumnName = "MediaTypeId", nullable = false)
    public MediatypeEntity getMediatypeByMediaTypeId() {
        return mediatypeByMediaTypeId;
    }

    public void setMediatypeByMediaTypeId(MediatypeEntity mediatypeByMediaTypeId) {
        this.mediatypeByMediaTypeId = mediatypeByMediaTypeId;
    }

    @ManyToOne
    @JoinColumn(name = "GenreId", referencedColumnName = "GenreId")
    public GenreEntity getGenreByGenreId() {
        return genreByGenreId;
    }

    public void setGenreByGenreId(GenreEntity genreByGenreId) {
        this.genreByGenreId = genreByGenreId;
    }
}
