
public class IntValidator  implements  Validator<Integer> {
    @Override
    public boolean isValid (Integer result) {
         boolean returned = false;
        if (result % 10 ==0) {
            return returned = true;
        }

        return returned;
    }

}
