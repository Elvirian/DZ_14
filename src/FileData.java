public class FileData {
    private String fileName;
    private Integer size;
    private String filePath;

    public FileData(String fileName, Integer size, String filePath) {
        this.fileName = fileName;
        this.size = size;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public Integer getSize() {
        return size;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public String toString() {
        return "{" +
                "fileName='" + fileName + '\'' +
                ", size=" + size +
                ", filePath='" + filePath + '\'' +
                '}' + '\n';
    }
}

