import java.util.*;

public class FileNavigator {
    private Map<String, List<FileData>> listMap;

    public FileNavigator() {
        this.listMap = new HashMap<String, List<FileData>>();
    }

    public void add(FileData fileData) {
        List<FileData> fileDataList = listMap.get(fileData.getFilePath());
        if (fileDataList != null) {
            fileDataList.add(fileData);
        } else {
            System.out.println(" Incorrect file path");
        }
    }

    public void find(String path) {
        if (listMap.containsKey(path)) {
            System.out.println(" Finding by path :" + '\n' + listMap.get(path));
        } else {
            System.out.println(" File not found ;");
        }
    }

    public Map<String, List<FileData>> filterBySize(int size) {
        Map<String, List<FileData>> lm = new HashMap<>();
        for (List<FileData> fd : listMap.values()) {
            for (FileData fileData : fd) {
                if (fileData.getSize() < size) {
                    lm.put(fileData.getFilePath(), fd);
                }
            }
        }
        return lm;
    }


    public void remove(String path) {
        listMap.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> list = new ArrayList<>();
        for (String key : listMap.keySet()) {
            list.addAll(listMap.get(key));
            list.sort(new Comparator<FileData>() {
                @Override
                public int compare(FileData o1, FileData o2) {
                    return o1.getSize().compareTo(o2.getSize());
                }
            });
        }
        return list;
    }

    public void addListMap(String path) {
        if (!listMap.containsKey(path)) {
            listMap.put(path, new ArrayList<FileData>());
        }
    }

    public Map<String, List<FileData>> getListMap() {
        return listMap;
    }
}