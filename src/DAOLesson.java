public class DAOLesson {
    static Data data = new FileSystem();
    public static void main(String[] args) {
        System.out.println(data.getData());
    }
}

interface Data {
    String getData();
}

class DB implements Data {
    String getFromTable() {
        return "Data from table";
    }

    @Override
    public String getData() {
        return getFromTable();
    }
}

class FileSystem implements Data {
    String getDataFromFS() {
        return "Data from FS";
    }

    @Override
    public String getData() {
        return getDataFromFS();
    }
}