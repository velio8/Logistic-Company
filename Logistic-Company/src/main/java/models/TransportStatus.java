package models;

import java.time.LocalDateTime;

public class TransportStatus {
    private int id;
    private int transportId;
    private String status;
    private LocalDateTime timestamp;

    public TransportStatus() {}

    public TransportStatus(int id, int transportId, String status, LocalDateTime timestamp) {
        this.id = id;
        this.transportId = transportId;
        this.status = status;
        this.timestamp = timestamp;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getTransportId() { return transportId; }
    public void setTransportId(int transportId) { this.transportId = transportId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
}


