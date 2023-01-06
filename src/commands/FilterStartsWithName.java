package commands;

import worker.MapWorker;

public class FilterStartsWithName extends CommandWithArg{


    public FilterStartsWithName() {
        super("������� ��������, �������� ���� name ������� ���������� � �������� ���������");
    }

    @Override
    public void execute() {
        for (Long id: MapWorker.getWorkers().keySet()) {
            if(MapWorker.getWorkers().get(id).getName().indexOf(arg)==0) System.out.println(MapWorker.getWorkers().get(id).toString());
        }
    }
}
