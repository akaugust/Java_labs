import java.util.Comparator;

public class PersonComparator implements Comparator<QueuePerson> {

    @Override
    public int compare(QueuePerson a, QueuePerson b) {
        return Integer.compare(a.getPriority(), b.getPriority());
    }
}
