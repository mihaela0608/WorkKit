package bg.softuni.workkit.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "files")
public class File extends BaseEntity{
    private String fileName;
    private String fileType;

    @Lob
    private byte[] data;

    @OneToOne
    private Task task;

    @Column(name = "created_at")
    private LocalDate createdAt;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }
}
