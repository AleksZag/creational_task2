import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        int elements = 0;
        int elementsTrue = 0;
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            elements++;
            if (i < treshold) {
                logger.log("Элемент " + i + " не проходит");
            } else {
                logger.log("Элемент " + i + " проходит");
                elementsTrue++;
                result.add(i);
            }
        }

        logger.log("Прошло фильтр " + elementsTrue + " из " + elements);
        return result;
    }
}
