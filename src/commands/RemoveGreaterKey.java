package commands;

import worker.MapWorker;

import java.util.*;

public class RemoveGreaterKey extends CommandWithArg {


    public RemoveGreaterKey() {
        super("������� �� ��������� ��� ��������, ���� ������� ��������� ��������");
    }

    @Override
    public void execute() {
        ArrayList<Long> keys = new ArrayList<>();
        Long minId = Long.parseLong(getArg());
        for (Long id : MapWorker.getWorkers().keySet()) {
            if (id > minId) keys.add(id);
        }
        if(keys.size()==0) {
            System.out.println("Element with given parameter not found");
            return;
        }
        for (Long id : keys) {
            MapWorker.getWorkers().remove(id);
        }
    }
}
