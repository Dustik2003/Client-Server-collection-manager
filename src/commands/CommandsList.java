package commands;

public enum CommandsList {
//    HELP("help", new Help(),"������� ������� �� ��������� ��������")
//    INFO("info",new Info("info"), "������� � ����������� ����� ������ ���������� � ���������" +
//            " (���, ���� �������������, ���������� ��������� � �.�.)"),
//    SHOW("show",, "������� � ����������� ����� ������ ��� �������� ��������� � ��������� �������������"),
//    INSERT("insert","{element} : �������� ����� ������� � �������� ������"),
//    UPDATE("update [0-9]+$", "id {element}: �������� �������� �������� ���������, id �������� ����� ���������"),
//    REMOVE_KEY("remove_key","������� ������� �� ��������� �� ��� �����"),
//    CLEAR("clear", "�������� ���������"),
//    SAVE("save", "��������� ��������� � ����"),
//    EXECUTE_SCRIPT("execute_script .*\\.txt$", "file_name :������� � ��������� ������ �� ���������� �����." +
//            " � ������� ���������� ������� � ����� �� ����, � ������� �� ������ ������������ � ������������� ������."),
//    EXIT("exit", "��������� ��������� (��� ���������� � ����)"),
//    HISTORY("history", "������� ��������� 11 ������ (��� �� ����������)"),
//
//    ADD_IF_MAX("add_if_max", "{element} : �������� ����� ������� � ���������, ���� ��� ��������" +
//            " ��������� �������� ����������� �������� ���� ���������"),
//    ADD_IF_MIN("add_if_min", "{element} : �������� ����� ������� � ���������, ���� ��� �������� ������, " +
//            "��� � ����������� �������� ���� ���������"),
//    REMOVE_GREATER_KEY("remove_greater_key", "null: ������� �� ��������� ��� ��������, ����������� ��������"),
    ;

    private final String title;
//    private final Command commandPattern;
    private final String description;

    CommandsList(String title, Command commandPattern, String description){
        this.title = title;
        this.description = description;
//        this.commandPattern = commandPattern;
    }

    public Command makeCommand() {
        return null;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
    //    insert null {element},
//    update id {element},
//    remove_key null ,
//    clear ,
//    save,
//    execute_script file_name,
//            exit,
//    history ;
//    replace_if_greater null {element} ;
//    remove_greater_key null ;
//    filter_by_salary salary;
//    filter_starts_with_name name;
//    filter_less_than_status status;
//

}
