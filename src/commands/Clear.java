package commands;

import worker.MapWorker;

public class Clear extends Command {


    public Clear() {
        super("�������� ���������");
    }

    @Override
    public String execute() {
        MapWorker.getWorkers().clear();
        return "";
    }
}
