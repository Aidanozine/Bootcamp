package Book4.chapter5;

import javax.print.attribute.standard.JobHoldUntil;
import java.util.*;

public class GenQueue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void enqueue(E item){
        list.add(item);
    }

    public E dequeue(){
        return list.poll();
    }

    public boolean hasItems(){
        return !list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    public void addItems(GenQueue<? extends E> q){
        while(q.hasItems()){
            list.addLast(q.dequeue());
        }
    }
}

class GenQueueTest{
    public static void main(String[] args) {
        GenQueue<Employee> empList;
        empList = new GenQueue<Employee>();

        GenQueue<HourlyEmployee> hourList;
        hourList = new GenQueue<HourlyEmployee>();
        hourList.enqueue(new HourlyEmployee("D'Light", "Turk"));
        hourList.enqueue(new HourlyEmployee("Biskitt", "Arryo"));
        hourList.enqueue(new HourlyEmployee("Creem", "Ramone"));

        empList.addItems(hourList);

        while(empList.hasItems()){
            Employee emp = empList.dequeue();
            System.out.println("Employee: " + emp.firstName + " " + emp.lastName);
        }
    }
}
