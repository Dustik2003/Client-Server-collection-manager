package commands;

import worker.MapWorker;

public class Clear extends Command {


    public Clear() {
        super("�������� ���������");
    }

    @Override
    public void execute() {
        MapWorker.getWorkers().clear();
    }
}
