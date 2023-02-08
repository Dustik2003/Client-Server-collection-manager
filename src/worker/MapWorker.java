package worker;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Random;

public class MapWorker {

    public static LinkedHashMap<Long, Worker> workers = new LinkedHashMap<>();
    public static Date date=new Date();


    public static void fill() {
        workers.put(getRandId(), new Worker("��������", new Coordinates(1f, 1), 1d, Status.FIRED, new Organization(123, OrganizationType.GOVERNMENT)));
        workers.put(getRandId(), new Worker("�����", new Coordinates(1f, 1), 12345d, Status.RECOMMENDED_FOR_PROMOTION, new Organization(123, OrganizationType.GOVERNMENT)));
        workers.put(getRandId(), new Worker("�������", new Coordinates(1f, 1), 12345d, Status.FIRED, new Organization(123, OrganizationType.GOVERNMENT)));
        workers.put(getRandId(), new Worker("�������", new Coordinates(1f, 1), 12345d, new Organization(123, OrganizationType.GOVERNMENT)));
        workers.put(getRandId(), new Worker("������", new Coordinates(1f, 1), 12345d, new Organization(123, OrganizationType.GOVERNMENT)));
        workers.put(getRandId(), new Worker("������", new Coordinates(1f, 1), 12345d, Status.REGULAR, new Organization(123, OrganizationType.GOVERNMENT)));
        workers.put(getRandId(), new Worker("�����", new Coordinates(1f, 1), 12345d, new Organization(123, OrganizationType.GOVERNMENT)));
        workers.put(getRandId(), new Worker("�����", new Coordinates(1f, 1), 12345d, Status.REGULAR, new Organization(123, OrganizationType.GOVERNMENT)));
        workers.put(getRandId(), new Worker("����", new Coordinates(1f, 1), 12345d, Status.REGULAR, new Organization(123, OrganizationType.GOVERNMENT)));
    }

    public MapWorker() {
        date=new Date();
        fill();
    }

    static private Long getRandId() {
        long id = (long) (Math.random() * 10000 + 2341);
        while (MapWorker.getWorkers().containsKey(id)) {
            id = (long) (Math.random() * 10000 + 2341);
        }
        return id;
    }

    public static LinkedHashMap<Long, Worker> getWorkers() {
        return workers;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
