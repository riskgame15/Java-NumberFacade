
import java.util.List;

public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;

    public RandomListFacade() {
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
        randomList = new RandomList();
    }

    public void printRandomEvenList() {
        int size = 50;
        int minNumber = 1;
        int maxNumber = 100;

        List<Integer> list = randomList.generateList(size, minNumber, maxNumber);
        list = listFilter.filterOdd(list);
        listPrinter.printList(list);
    }
}
