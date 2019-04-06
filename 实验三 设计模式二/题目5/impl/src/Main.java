import filter.AbstractFilter;
import filter.CodeFilter;
import filter.TypeFilter;
import filter.VerifyFilter;

public class Main {

    public static void main(String[] args) {

        AbstractFilter codeFilter = new CodeFilter();
        AbstractFilter typeFilter = new TypeFilter();
        AbstractFilter verifyFilter = new VerifyFilter();
        codeFilter.setFilter(typeFilter);
        typeFilter.setFilter(verifyFilter);

        Integer data = 2;
        codeFilter.processData(data);
    }
}
