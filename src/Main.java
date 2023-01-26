public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.addListMap("src/main/File1");
        fileNavigator.addListMap("src/main/File2");
        fileNavigator.addListMap("src/main/File3");

        FileData fileData = new FileData("File1.xml", 100, "src/main/File1");
        FileData fileData1 = new FileData("File2.xml", 85, "src/main/File2");
        FileData fileData2 = new FileData("File3.xml", 50, "src/main/File3");
        fileNavigator.add(fileData);
        fileNavigator.add(fileData1);
        fileNavigator.add(fileData2);
        System.out.println(" Adding to map :" + '\n' + fileNavigator.getListMap());
        fileNavigator.find("src/main/File3");
        System.out.println(" Filter by size :" + '\n' + fileNavigator.filterBySize(90));
        System.out.println("Sorted by size :" + '\n' + fileNavigator.sortBySize());
        fileNavigator.remove("src/main/File2");
        System.out.println(" After remove :" + '\n' + fileNavigator.getListMap());
    }
}